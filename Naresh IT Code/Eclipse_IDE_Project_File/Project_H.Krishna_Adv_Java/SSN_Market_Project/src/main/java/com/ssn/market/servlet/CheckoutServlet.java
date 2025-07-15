package com.ssn.market.servlet;

import java.io.IOException;
import java.util.Map;

import com.ssn.market.model.CartItem;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get cart from session
        HttpSession session = request.getSession();
        Map<Integer, CartItem> cart = (Map<Integer, CartItem>) session.getAttribute("cart");

        if (cart == null || cart.isEmpty()) {
            // Redirect to cart page if cart is empty
            response.sendRedirect(request.getContextPath() + "/cart");
            return;
        }

        // Forward to checkout page
        request.setAttribute("cart", cart);
        request.getRequestDispatcher("/WEB-INF/views/checkout.jsp").forward(request, response);
    }
}
