package com.ssn.project;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {

    // A simple Product class (you can replace with a proper model)
    public static class Product {
        private int id;
        private String name;
        private String category;
        private double price;

        public Product(int id, String name, String category, double price) {
            this.id = id;
            this.name = name;
            this.category = category;
            this.price = price;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getCategory() { return category; }
        public double getPrice() { return price; }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parameters
        String productIdStr = request.getParameter("productId");
        String category = request.getParameter("category");

        if (productIdStr == null || category == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        int productId = Integer.parseInt(productIdStr);

        // Simulate product lookup (replace with database lookup later)
        Product product = new Product(productId, category + " Product " + productId, category, 20 + productId * 5);

        // Retrieve cart from session
        HttpSession session = request.getSession();
        List<Product> cart = (List<Product>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        // Check if product already exists (optional logic to prevent duplicates)
        boolean exists = false;
        for (Product p : cart) {
            if (p.getId() == productId && p.getCategory().equalsIgnoreCase(category)) {
                exists = true;
                break;
            }
        }

        if (!exists) {
            cart.add(product);
        }

        // Save cart back to session
        session.setAttribute("cart", cart);

        // Redirect back to category page
        response.sendRedirect("category.jsp?cat=" + category);
    }
}
