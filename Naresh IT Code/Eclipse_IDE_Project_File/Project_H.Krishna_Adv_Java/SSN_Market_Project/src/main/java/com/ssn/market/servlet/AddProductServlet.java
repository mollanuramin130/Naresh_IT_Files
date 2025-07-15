package com.ssn.market.servlet;

import com.ssn.market.dao.ProductDAO;
import com.ssn.market.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/add-product")
public class AddProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ProductDAO productDAO;

    @Override
    public void init() {
        productDAO = new ProductDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/add-product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String name = request.getParameter("name");
            String description = request.getParameter("description");
            double price = Double.parseDouble(request.getParameter("price"));
            String imageUrl = request.getParameter("imageUrl");

            Product product = new Product();
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            product.setImageUrl(imageUrl);

            boolean success = productDAO.addProduct(product);

            if (success) {
            	response.sendRedirect(request.getContextPath() + "/admin-dashboard?success=Product+added+successfully");
            } else {
                request.setAttribute("error", "Product could not be added. Please try again.");
                request.getRequestDispatcher("/WEB-INF/views/add-product.jsp").forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Invalid input or server error.");
            request.getRequestDispatcher("/WEB-INF/views/add-product.jsp").forward(request, response);
        }
    }
}
