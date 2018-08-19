package edu.hebut.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static final String driverName = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://39.104.111.76/customer?useSSL=false";
    private static final String username = "root";
    private static final String password = "!qaz@WSX3edc?";

    private static Connection connection;

    public static synchronized Connection getConnection() {
        try {
            Class.forName(driverName);
            synchronized(DbUtil.class) {
                if (connection == null || connection.isClosed()) {
                    connection =  DriverManager.getConnection(url,username,password);
                }
            }
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static boolean close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
