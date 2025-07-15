// ProductServlet.java
package com.ssn.market.servlet;

import com.ssn.market.dao.ProductDAO;
import com.ssn.market.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/shop")
public class ProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        ProductDAO dao = new ProductDAO();
        System.out.println(dao);
        List<Product> productList = dao.getAllProducts();
        System.out.println("In Servlet Product list size: " + productList.size());
        request.setAttribute("products", productList);

        // Forward to JSP (inside /WEB-INF/views/shop.jsp)
        request.getRequestDispatcher("/WEB-INF/views/shop.jsp").forward(request, response);
    }
}
