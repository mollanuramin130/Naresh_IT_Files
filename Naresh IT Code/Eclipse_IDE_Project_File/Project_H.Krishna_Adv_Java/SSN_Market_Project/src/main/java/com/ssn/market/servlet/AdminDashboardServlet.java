package com.ssn.market.servlet;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.ssn.market.dao.DashboardDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admin-dashboard")
public class AdminDashboardServlet extends HttpServlet {

    private DashboardDAO dashboardDAO;

    @Override
    public void init() throws ServletException {
        dashboardDAO = new DashboardDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Basic stats
        int totalOrders = dashboardDAO.getTotalOrders();
        double totalRevenue = dashboardDAO.getTotalRevenue();
        int totalStaff = dashboardDAO.getTotalStaff();

        request.setAttribute("totalOrders", totalOrders);
        request.setAttribute("totalRevenue", totalRevenue);
        request.setAttribute("totalStaff", totalStaff);

        // Bar Chart: Order count by status
        List<String> orderLabels = dashboardDAO.getOrderCategoryLabels();     // e.g., Completed, Pending
        List<Integer> orderCounts = dashboardDAO.getOrderCategoryCounts();    // e.g., 5, 3

        // Pie Chart: Revenue by item
        List<String> revenueLabels = dashboardDAO.getRevenueCategoryLabels(); // e.g., Veg Pizza, Burger
        List<Double> revenueData = dashboardDAO.getRevenueCategoryAmounts();  // e.g., 500.0, 700.0

        // Convert to JSON using Gson
        Gson gson = new Gson();
        request.setAttribute("orderLabels", gson.toJson(orderLabels));
        request.setAttribute("orderCounts", gson.toJson(orderCounts));
        request.setAttribute("revenueLabels", gson.toJson(revenueLabels));
        request.setAttribute("revenueData", gson.toJson(revenueData));

        // Forward to JSP
        request.getRequestDispatcher("/WEB-INF/views/dashboard.jsp").forward(request, response);
    }
}
