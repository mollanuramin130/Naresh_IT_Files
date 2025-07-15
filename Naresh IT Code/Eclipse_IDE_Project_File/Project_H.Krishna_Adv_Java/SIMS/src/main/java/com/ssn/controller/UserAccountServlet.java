package com.ssn.controller;

import java.io.IOException;

import com.ssn.model.dao.UserAccountDAO;
import com.ssn.model.pojo.UserAccountPOJO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/UserAccountServlet")
public class UserAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Handle user registration logic here
		// For example, you can retrieve form data and save it to the database
		
		HttpSession session = request.getSession();// Create a session for the user if not already exists
		
		String action=request.getParameter("action").toLowerCase();
		
		UserAccountDAO userAccountDAO = new UserAccountDAO();
		session.setAttribute("userAccountDAO", userAccountDAO); 
		System.out.println("userAccountDAO: "+userAccountDAO);// Store DAO in session for later use
		
		// Open a connection to the database
		if (!userAccountDAO.openConnection()) {
			System.err.println("Failed to open database connection.");
			request.setAttribute("error", "Database connection error!");
			request.getRequestDispatcher("/error.jsp").forward(request, response);
			return;
		}
		userAccountDAO.createStatement();
		
		
		switch(action) {
			case "register":{
				// Handle registration logic
				UserAccountPOJO userAccountPOJO = new UserAccountPOJO();
				
				userAccountPOJO.setFullName(request.getParameter("fullname"));
				userAccountPOJO.setUserName(request.getParameter("username"));
				userAccountPOJO.setEmail(request.getParameter("email"));
				userAccountPOJO.setPhone(request.getParameter("phone"));
				userAccountPOJO.setAddress(request.getParameter("address"));
				userAccountPOJO.setDob(request.getParameter("dob"));
				userAccountPOJO.setPassword(request.getParameter("password"));
				
				request.setAttribute("userAccountPOJO", userAccountPOJO);
				
				if (!userAccountDAO.createUser(userAccountPOJO)) {
					request.setAttribute("error", "User registration failed!");
					request.getRequestDispatcher("/error.jsp").forward(request, response);
					return;
				}
				
				request.setAttribute("message", "User registered successfully!");
				request.getRequestDispatcher("/success.jsp").forward(request, response);
				break;
			}
			case "login":{
				// Handle login logic
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				UserAccountPOJO userAccountPOJO = userAccountDAO.loginUser(username, password);
				
				if (userAccountPOJO == null) {
					System.out.println("in loginUser userAccountPOJO returned null");
					request.setAttribute("error", "Invalid username or password!");
					request.getRequestDispatcher("/error.jsp").forward(request, response);
					return;
				}
				
				session.setAttribute("userAccountPOJO", userAccountPOJO);
				session.setAttribute("username", username);
				request.getRequestDispatcher("/welcome.jsp").forward(request, response);
				break;
			}
			default:
				request.setAttribute("error", "Invalid action!");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
		
	}
}
