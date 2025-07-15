package com.ssn.market.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            Properties props = new Properties();
            InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("driverinfo.properties");
            props.load(inputStream);

            String dbDriver = props.getProperty("DB_DRIVER");
            String dbURL = props.getProperty("DB_URL");
            String dbUSN = props.getProperty("DB_USN");
            String dbPWD = props.getProperty("DB_PWD");

            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbURL, dbUSN, dbPWD);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
