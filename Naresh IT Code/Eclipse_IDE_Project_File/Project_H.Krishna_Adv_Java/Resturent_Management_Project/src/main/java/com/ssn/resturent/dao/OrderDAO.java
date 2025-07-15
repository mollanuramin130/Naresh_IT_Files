package com.ssn.resturent.dao;

import com.ssn.resturent.pojo.Order;

import java.sql.*;
import java.util.*;
import java.io.InputStream;

public class OrderDAO {
    private Connection conn;

    public OrderDAO() {
        try {
            Properties props = new Properties();
            InputStream input = getClass().getClassLoader().getResourceAsStream("driverinfo.properties");
            props.load(input);

            String driver = props.getProperty("DB_DRIVER");
            String url = props.getProperty("DB_URL");
            String user = props.getProperty("DB_USN");
            String pass = props.getProperty("DB_PWD");

            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();
        System.out.println("Nur Execute");

        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM orders ORDER BY order_time DESC");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Order o = new Order();
                o.setOrderId(rs.getInt("order_id"));
                o.setItemName(rs.getString("item_name"));
                o.setQuantity(rs.getInt("quantity"));
                o.setPrice(rs.getDouble("price"));
                o.setStatus(rs.getString("status"));
                o.setOrderTime(rs.getTimestamp("order_time"));
                orders.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return orders;
    }
}
