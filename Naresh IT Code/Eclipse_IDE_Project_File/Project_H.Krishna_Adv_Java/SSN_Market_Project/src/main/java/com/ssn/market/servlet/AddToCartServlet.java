package com.ssn.market.servlet;

import com.ssn.market.dao.ProductDAO;
import com.ssn.market.model.CartItem;
import com.ssn.market.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;

@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int productId = Integer.parseInt(request.getParameter("productId"));
        HttpSession session = request.getSession();

        @SuppressWarnings("unchecked")
        Map<Integer, CartItem> cart = (Map<Integer, CartItem>) session.getAttribute("cart");

        if (cart == null) {
            cart = new LinkedHashMap<>();
        }

        ProductDAO productDAO = new ProductDAO();
        Product product = productDAO.getProductById(productId);

        if (product != null) {
            if (cart.containsKey(productId)) {
                CartItem item = cart.get(productId);
                item.setQuantity(item.getQuantity() + 1);
            } else {
                CartItem item = new CartItem();
               // item.setProductId(product.getProductId());
                item.setName(product.getName());
                item.setDescription(product.getDescription());
                item.setPrice(product.getPrice());
                item.setQuantity(1);
                cart.put(productId, item);
            }
        }

        session.setAttribute("cart", cart);
        response.sendRedirect(request.getContextPath() + "/cart");
    }
}
