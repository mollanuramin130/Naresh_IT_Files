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

@WebServlet("/RemoveFromCartServlet")
public class RemoveFromCartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Map<Integer, CartItem> cart = (Map<Integer, CartItem>) session.getAttribute("cart");
        System.out.println("Remove button clicked");
        if (cart != null) {
            try {
                int id = Integer.parseInt(request.getParameter("id"));
                System.out.println("cart ID: " + id);
                cart.remove(id);
            } catch (NumberFormatException e) {
                // Ignore bad ID
            }

            session.setAttribute("cart", cart);
        }

        // ✅ Correct redirect to your /cart mapping
        response.sendRedirect(request.getContextPath() + "/cart");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
