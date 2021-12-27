package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String datasourceURL = "jdbc:mysql://localhost:3306/hb-03-one-to-many?useSSL=false";
        String username = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(datasourceURL, username, password)) {
            System.out.println(con);
            System.out.println("Connection Success!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

