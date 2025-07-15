package com.ssn.project;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/PlaceOrderServlet")
public class PlaceOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        // Get form data
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String payment = request.getParameter("payment");

        // Get cart
        List<AddToCartServlet.Product> cart = (List<AddToCartServlet.Product>) session.getAttribute("cart");

        if (cart == null || cart.isEmpty()) {
            session.setAttribute("orderError", "Your cart is empty.");
            response.sendRedirect("checkout.jsp");
            return;
        }

        // Simulate order save logic (can be replaced with DB logic)
        double total = 0;
        for (AddToCartServlet.Product p : cart) {
            total += p.getPrice();
        }

        // Save order summary in session (or store in DB)
        session.setAttribute("orderSuccess", "Order placed successfully!");
        session.setAttribute("orderTotal", total);
        session.setAttribute("orderName", fullname);
        session.setAttribute("orderEmail", email);
        session.setAttribute("orderAddress", address);
        session.setAttribute("orderPayment", payment);

        // Clear cart
        session.removeAttribute("cart");

        // Redirect to confirmation page
        response.sendRedirect("order_success.jsp");
    }
}
