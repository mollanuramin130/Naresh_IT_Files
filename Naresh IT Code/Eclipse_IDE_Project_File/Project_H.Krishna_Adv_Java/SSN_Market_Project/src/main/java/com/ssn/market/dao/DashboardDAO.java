package com.ssn.market.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.ssn.market.util.DBUtil;

public class DashboardDAO {

    public int getTotalOrders() {
        String sql = "SELECT COUNT(*) FROM orders";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public double getTotalRevenue() {
        String sql = "SELECT SUM(price * quantity) FROM orders";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) return rs.getDouble(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    public int getTotalStaff() {
        String sql = "SELECT COUNT(*) FROM staff";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // --- CHART DATA: Order Status Wise Count (Bar Chart)
    public List<String> getOrderCategoryLabels() {
        List<String> labels = new ArrayList<>();
        String sql = "SELECT status, COUNT(*) FROM orders GROUP BY status ORDER BY status";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                labels.add(rs.getString(1)); // Status like Completed, Pending
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return labels;
    }

    public List<Integer> getOrderCategoryCounts() {
        List<Integer> data = new ArrayList<>();
        String sql = "SELECT status, COUNT(*) FROM orders GROUP BY status ORDER BY status";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                data.add(rs.getInt(2)); // Count
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    // --- CHART DATA: Revenue per Item (Pie Chart)
    public List<String> getRevenueCategoryLabels() {
        List<String> labels = new ArrayList<>();
        String sql = "SELECT item_name, SUM(price * quantity) FROM orders GROUP BY item_name ORDER BY item_name";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                labels.add(rs.getString(1)); // Item name
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return labels;
    }

    public List<Double> getRevenueCategoryAmounts() {
        List<Double> data = new ArrayList<>();
        String sql = "SELECT item_name, SUM(price * quantity) FROM orders GROUP BY item_name ORDER BY item_name";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                data.add(rs.getDouble(2)); // Total revenue per item
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
