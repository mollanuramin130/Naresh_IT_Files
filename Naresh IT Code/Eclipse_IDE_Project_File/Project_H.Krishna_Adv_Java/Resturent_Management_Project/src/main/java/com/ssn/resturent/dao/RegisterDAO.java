package com.ssn.resturent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ssn.resturent.util.DBUtil;

public class RegisterDAO {

    public boolean isUsernameTaken(String username) {
        boolean exists = false;
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT username FROM STAFF WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            exists = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exists;
    }

    public boolean registerStaff(String name, String username, String password) {
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO STAFF (staff_id, name, username, password) VALUES (staff_seq.NEXTVAL, ?, ?, ?)"
            );
            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, password); // TODO: add hashing if needed

            int inserted = ps.executeUpdate();
            return inserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
