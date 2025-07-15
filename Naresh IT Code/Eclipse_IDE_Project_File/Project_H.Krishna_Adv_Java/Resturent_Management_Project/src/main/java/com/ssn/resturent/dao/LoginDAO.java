package com.ssn.resturent.dao;

import java.sql.*;
import java.util.UUID;
import com.ssn.resturent.util.DBUtil;

public class LoginDAO {

    public String validateUser(String username, String password) {
        String token = null;
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                "SELECT staff_id FROM STAFF WHERE username = ? AND password = ?"
            );
            ps.setString(1, username);
            ps.setString(2, password); // Note: Use hashing in real apps

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // Generate secure token and update
                token = UUID.randomUUID().toString();
                PreparedStatement update = conn.prepareStatement(
                    "UPDATE STAFF SET token = ? WHERE staff_id = ?"
                );
                update.setString(1, token);
                update.setInt(2, rs.getInt("staff_id"));
                update.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return token; // null means invalid user
    }

    public String getUserNameByToken(String token) {
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT username FROM STAFF WHERE token = ?");
            ps.setString(1, token);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getString("username");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
