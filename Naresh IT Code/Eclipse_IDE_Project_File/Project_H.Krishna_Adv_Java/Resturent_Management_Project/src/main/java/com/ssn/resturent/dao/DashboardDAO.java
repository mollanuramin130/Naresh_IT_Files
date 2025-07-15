package com.ssn.resturent.dao;

import com.ssn.resturent.pojo.Order;
import com.ssn.resturent.util.DBUtil;

import java.sql.*;
import java.util.*;

public class DashboardDAO {
    Connection con;

    public DashboardDAO() throws Exception {
        con = DBUtil.getConnection();
    }

    public int getTotalOrders() throws SQLException {
        String sql = "SELECT COUNT(*) FROM orders";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getInt(1) : 0;
        }
    }

    public double getTotalRevenue() throws SQLException {
        String sql = "SELECT SUM(price) FROM orders WHERE status='Delivered'";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getDouble(1) : 0.0;
        }
    }

    public int getTotalStaff() throws SQLException {
        String sql = "SELECT COUNT(*) FROM staff";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getInt(1) : 0;
        }
    }

    public List<Order> getLatestOrders() throws SQLException {
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM (SELECT * FROM orders ORDER BY order_time DESC) WHERE ROWNUM <= 5";

        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Order order = new Order();
                order.setOrderId(rs.getInt("order_id"));
                order.setItemName(rs.getString("item_name"));
                order.setQuantity(rs.getInt("quantity"));
                order.setPrice(rs.getDouble("price"));
                order.setStatus(rs.getString("status"));
                order.setOrderTime(rs.getTimestamp("order_time"));
                list.add(order);
            }
        }

        return list;
    }
}
