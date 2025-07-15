package com.ssn.resturent.servlet;

import com.ssn.resturent.dao.DashboardDAO;
import com.ssn.resturent.pojo.Order;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/dashboard")
public class DashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DashboardDAO dao = new DashboardDAO();

            int totalOrders = dao.getTotalOrders();
            double totalRevenue = dao.getTotalRevenue();
            int totalStaff = dao.getTotalStaff();
            List<Order> latestOrders = dao.getLatestOrders();

            request.setAttribute("totalOrders", totalOrders);
            request.setAttribute("totalRevenue", totalRevenue);
            request.setAttribute("totalStaff", totalStaff);
            request.setAttribute("latestOrders", latestOrders);

            request.getRequestDispatcher("/admin/dashboard.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
