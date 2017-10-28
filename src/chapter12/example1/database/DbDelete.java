package chapter12.example1.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dalgarins
 */
public class DbDelete {

    public static void main(String[] args) {

        try (Connection connection = DbConnector.connectToDb();
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet resulset = statement .executeQuery("SELECT * FROM ROOT.CONTACT WHERE FIRST_NAME = 'Darwin'");) {

            while (resulset.next()) {
                resulset.deleteRow();
            }
            resulset.close();

            try (ResultSet resultset = statement.executeQuery("SELECT * FROM ROOT.CONTACT")) {
                System.out.println("After delete");
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

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(-1);
        }

    }

}
