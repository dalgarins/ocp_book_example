package chapter12.example1.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dalgarins
 */
public class DbQuery {

    public static void main(String[] args) {

        try (Connection connection = DbConnector.connectToDb();
                Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery("SELECT * FROM ROOT.CONTACT")) {

            System.out.println("ID \tfName \tlName \temail \t\tphone");
            
// por nombre de columnas
            
//            while (resultset.next()) {                
//                System.out.println(resultset.getInt("id") + "\t"
//                + resultset.getString("first_name") + "\t"
//                + resultset.getString("last_name") + "\t"
//                + resultset.getString("email") + "\t"
//                + resultset.getString("phone_no") + "\t");
//            }

// por indices

//            while (resultset.next()) {
//                System.out.println(resultset.getInt(1) + "\t"
//                        + resultset.getString(2) + "\t"
//                        + resultset.getString(3) + "\t"
//                        + resultset.getString(4) + "\t"
//                        + resultset.getString(5) + "\t");
//            }

// son desconocidos la columnas

            
            int numOfColumns = resultset.getMetaData().getColumnCount();

            while (resultset.next()) {
                
                for (int i = 1; i <= numOfColumns; i++) {
                    System.out.print(resultset.getObject(i) + "\t");                    
                }
                System.out.println("");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
