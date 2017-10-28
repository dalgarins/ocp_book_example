
package chapter12.example1.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dalgarins
 */
public class DbQuery4 {

    public static void main(String[] args) {

        try (Connection connection = DbConnector.connectToDb();
                Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery("SELECT FIRST_NAME, EMAIL FROM ROOT.CONTACT WHERE FIRST_NAME = 'Michael'")) {
            
            System.out.println("fName \temail");
            while (resultset.next()) {                
                System.out.println(resultset.getString("first_name") + "\t"
                + resultset.getString("email"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        
    }
    
}
