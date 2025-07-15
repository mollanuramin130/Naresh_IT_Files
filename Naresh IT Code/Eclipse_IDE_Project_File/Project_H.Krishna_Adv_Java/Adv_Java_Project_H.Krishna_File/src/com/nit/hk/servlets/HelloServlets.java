package com.nit.hk.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloServlets implements Servlet {
	
	private ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		//Printing on Servet Console
		System.out.println("Service is Executed");
		
		//Printing on Client Browser
		System.out.println("Service is Executed");
		PrintWriter out=res.getWriter();
		out.println("Hi Welcome to NareshIT..");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy is Executed..");
	}
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
