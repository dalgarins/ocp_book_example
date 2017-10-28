package chapter12.example1.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dalgarins
 */
public class DbCreateTable {

    public static void main(String[] args) {

        try (Connection connection = DbConnector.connectToDb();
                Statement statement = connection.createStatement()) {
            
            statement.executeUpdate("CREATE TABLE familyGroup ("
                    + "id int not null,"
                    + "nickname varchar(30))");
            
            System.out.println("table create");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(-1);
        }        
    }   
}
