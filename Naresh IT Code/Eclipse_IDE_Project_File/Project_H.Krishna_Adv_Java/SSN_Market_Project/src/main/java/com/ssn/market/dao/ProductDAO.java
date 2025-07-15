package com.ssn.market.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ssn.market.model.Product;
import com.ssn.market.util.DBUtil;

public class ProductDAO {

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        String query = "SELECT PRODUCT_ID, NAME, DESCRIPTION, PRICE, IMAGE_URL FROM PRODUCTS";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Product p = new Product();
                p.setProductId(rs.getInt("PRODUCT_ID"));
                p.setName(rs.getString("NAME"));
                p.setDescription(rs.getString("DESCRIPTION"));
                p.setPrice(rs.getDouble("PRICE"));
                p.setImageUrl(rs.getString("IMAGE_URL"));
                products.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace(); // Better: log this in real projects
        }
        System.out.println("In DAO Product list size: " + products.size());
        return products; // If no data, returns empty list ([]) — not null
    }
    
    public boolean addProduct(Product p) {
    	String sql = "INSERT INTO products (product_id, name, description, price, image_url) VALUES (product_seq.NEXTVAL, ?, ?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getName());
            ps.setString(2, p.getDescription());
            ps.setDouble(3, p.getPrice());
            ps.setString(4, p.getImageUrl());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Product getProductById(int id) {
        String sql = "SELECT * FROM products WHERE product_id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Product p = new Product();
                    p.setProductId(rs.getInt("product_id"));
                    p.setName(rs.getString("name"));
                    p.setDescription(rs.getString("description"));
                    p.setPrice(rs.getDouble("price"));
                    p.setImageUrl(rs.getString("image_url"));
                    return p;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
