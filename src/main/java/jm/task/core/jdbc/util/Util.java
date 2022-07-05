package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/mydb113";
    private static final String USER = "root";
    private static final String PASSWORD = "chmykh99";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static Connection getNewConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            connection.setAutoCommit(false);
        } catch (Exception e) {
            e.getMessage();
        }
        return connection;
    }
}
