package chapter12.example1.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dalgarins
 */
public class DbConnector {

    public static Connection connectToDb() throws SQLException {
        
        String url = "jdbc:derby://localhost:1527/";
        String database = "addressBook";
        String userName = "root";
        String password = "admin";
        return DriverManager.getConnection(url + database, userName, password);
        
    }
    
}
