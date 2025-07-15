package com.ssn.resturent.servlet;

import com.ssn.resturent.dao.LoginDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {
    private LoginDAO loginDAO;

    @Override
    public void init() {
        loginDAO = new LoginDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String token = loginDAO.validateUser(username, password);

        if (token != null) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("token", token);
            session.setMaxInactiveInterval(30 * 60); // 30 min session

            Cookie tokenCookie = new Cookie("login_token", token);
            tokenCookie.setMaxAge(60 * 60 * 24); // 1 day
            response.addCookie(tokenCookie);

            response.sendRedirect("dashboard.jsp");
        } else {
            request.setAttribute("errorMsg", "Invalid username or password");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
