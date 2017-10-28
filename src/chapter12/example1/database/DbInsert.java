package chapter12.example1.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dalgarins
 */
public class DbInsert {

    public static void main(String[] args) {

        try (Connection connection = DbConnector.connectToDb();
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet resultset = statement.executeQuery("SELECT * FROM ROOT.CONTACT")) {
            
            System.out.println("Before inserting");
            System.out.println("id \tfName \tlName \temail \t\tphoneNo");
            
            while (resultset.next()) {                
                System.out.println(
                        resultset.getInt("id") + "\t"
                        + resultset.getString("first_name") + "\t"
                        + resultset.getString("last_name") + "\t"
                        + resultset.getString("email") + "\t"
                        + resultset.getString("phone_no") + "\t"
                );
            }
            
            resultset.moveToInsertRow();
            resultset.updateString("first_name", "Darwin");
            resultset.updateString("last_name", "Algarin");
            resultset.updateString("email", "dalgarins");
            resultset.updateString("phone_no", "+5689");
            resultset.insertRow();
            System.out.println("After the insert");
            
            System.out.println("id \tfName \tlName \temail \t\tphoneNo");
            resultset.beforeFirst();
            while (resultset.next()) {                
                System.out.println(
                        resultset.getInt("id") + "\t"
                        + resultset.getString("first_name") + "\t"
                        + resultset.getString("last_name") + "\t"
                        + resultset.getString("email") + "\t"
                        + resultset.getString("phone_no") + "\t"
                );
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(-1);
        }
        
        
    }
    
}
