package com.ssn.resturent.servlet;

import java.io.IOException;
import java.util.List;

import com.ssn.resturent.dao.OrderDAO;
import com.ssn.resturent.pojo.Order;
import com.ssn.resturent.util.DBUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/orders")
public class OrderServlet extends HttpServlet {
    private OrderDAO orderDAO;

    @Override
    public void init() {
        orderDAO = new OrderDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

       
        
        
        OrderDAO dao = new OrderDAO();
        List<Order> orderList = dao.getAllOrders();  // Fetching from DB

        request.setAttribute("orderList", orderList); // Setting in request
        request.getRequestDispatcher("orders.jsp").forward(request, response); // Forward to JSP
        
    }
}
