package com.ssn.market.servlet;

import java.io.IOException;
import java.util.Map;

import com.ssn.market.model.CartItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/PlaceOrderServlet")
public class PlaceOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Map<Integer, CartItem> cart = (Map<Integer, CartItem>) session.getAttribute("cart");

        String address = request.getParameter("address");

        if (cart == null || cart.isEmpty() || address == null || address.isBlank()) {
            response.sendRedirect(request.getContextPath() + "/checkout");
            return;
        }

        // Here you would save the order in DB
        System.out.println("Order Placed!");
        System.out.println("Shipping Address: " + address);
        System.out.println("Items: " + cart);

        // Clear the cart
        session.removeAttribute("cart");

        // Forward to confirmation page
        request.getRequestDispatcher("/WEB-INF/views/confirmation.jsp").forward(request, response);
    }
}
