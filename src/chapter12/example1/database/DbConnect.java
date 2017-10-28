package chapter12.example1.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author dalgarins
 */
public class DbConnect {

    public static void main(String[] args) {

        String url = "jdbc:derby://localhost:1527/";
        
        String database = "addressBook";
        
        String userName = "root";
        String password = "admin";
        
        try (Connection connection = DriverManager.getConnection(url + database, userName, password)) {
            System.out.println("Database connection successfully");
            
            Driver driver = DriverManager.getDriver(url);
            Connection con = driver.connect(url, null);
            System.out.println(driver);
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
    
}
