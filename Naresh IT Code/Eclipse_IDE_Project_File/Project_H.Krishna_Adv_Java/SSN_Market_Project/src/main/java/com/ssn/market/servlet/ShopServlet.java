package com.ssn.market.servlet;

import com.ssn.market.dao.ProductDAO;
import com.ssn.market.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/shop2")
public class ShopServlet extends HttpServlet {

    private ProductDAO productDAO;

    @Override
    public void init() {
        productDAO = new ProductDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Product> products = productDAO.getAllProducts();
        request.setAttribute("products", products);

        request.getRequestDispatcher("/WEB-INF/views/shop.jsp").forward(request, response);
    }
}
