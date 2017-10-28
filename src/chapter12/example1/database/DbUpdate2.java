package chapter12.example1.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dalgarins
 */
public class DbUpdate2 {

    public static void main(String[] args) {
    
        try (Connection connection = DbConnector.connectToDb();
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet resultset = statement.executeQuery("SELECT * FROM ROOT.CONTACT WHERE FIRST_NAME = 'Michael'")) {
            
            System.out.println("Before the update");
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
            
            resultset.absolute(1);
            resultset.updateString("phone_no", "+9999993333");
            resultset.updateRow();
            System.out.println("After update");
            
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
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }        
    
    }
    
}
