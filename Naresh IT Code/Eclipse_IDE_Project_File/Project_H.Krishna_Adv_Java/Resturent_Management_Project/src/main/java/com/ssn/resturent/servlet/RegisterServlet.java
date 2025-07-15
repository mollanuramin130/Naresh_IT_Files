package com.ssn.resturent.servlet;

import com.ssn.resturent.dao.RegisterDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private RegisterDAO registerDAO;

    @Override
    public void init() {
        registerDAO = new RegisterDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (registerDAO.isUsernameTaken(username)) {
            request.setAttribute("errorMsg", "Username already exists. Please choose another.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }

        boolean success = registerDAO.registerStaff(name, username, password);
        if (success) {
            request.setAttribute("successMsg", "Registration successful. Please login.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMsg", "Registration failed. Try again.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}
