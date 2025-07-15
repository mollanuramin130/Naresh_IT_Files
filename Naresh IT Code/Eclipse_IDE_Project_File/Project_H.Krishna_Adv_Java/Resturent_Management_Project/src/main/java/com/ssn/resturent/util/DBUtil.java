package com.ssn.resturent.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Properties props = new Properties();
                InputStream input = DBUtil.class.getClassLoader().getResourceAsStream("driverinfo.properties");

                if (input == null) {
                    System.out.println("❌ db.properties file not found!");
                    return null;
                }

                props.load(input);

                String driver = props.getProperty("DB_DRIVER");
                String url = props.getProperty("DB_URL");
                String username = props.getProperty("DB_USN");
                String password = props.getProperty("DB_PWD");

                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
