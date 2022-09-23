package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private  static final String URL = "jdbc:mysql://localhost:3306/PP_1.1.3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345678";
    public static Connection getConnection () {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection succeeded!");


        } catch (SQLException e) {
            System.err.println("No connection! " + e);
        }
        return connection;
    }
}
