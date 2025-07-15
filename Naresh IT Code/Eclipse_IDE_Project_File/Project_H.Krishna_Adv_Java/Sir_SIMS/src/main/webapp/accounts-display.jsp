<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.nit.hk.dao.UserAccountDAO"%>
	<%@page import="java.util.ArrayList"%>
	<%@page import="java.io.IOException"%>
	<%@page import="com.nit.hk.pojo.UserAccount"%>

	<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Account Details</title>
		</head>
		<body>
			<jsp:include page="./home.jsp"/>
			<%
				UserAccount 			account 		= (UserAccount)request.getAttribute("account");
				ArrayList<UserAccount> 	accountsList 	= (ArrayList<UserAccount>)request.getAttribute("accountsList");
			%>
			<% if(account!= null){ %>
				<H1><%= account.getUsername() %> details</H1>
				<table border="2">
					<tr>
						<td>UserId</td>
						<td>Username</td>
						<td>Password</td>
						<td>Email</td>
						<td>Mobile</td>
					</tr>
				
					<tr>
						<td><%= account.getUserId() 	%> </td>
						<td><%= account.getUsername() 	%> </td>
						<td><%= account.getPassword() 	%> </td>
						<td><%= account.getEmail() 		%> </td>
						<td><%= account.getMobile() 	%> </td>
					</tr>
				</table>
			<% }  else if(accountsList!=null && !accountsList.isEmpty()) { %>			
				<H1>All users details</H1>
				<table border="2">
					<tr>
						<td>UserId</td>
						<td>Username</td>
						<td>Password</td>
						<td>Email</td>
						<td>Mobile</td>
					</tr>
					<% for(UserAccount userAccount : accountsList) { %>
						<tr>
							<td><%= userAccount.getUserId() 	%></td>
							<td><%= userAccount.getUsername() 	%></td>
							<td><%= userAccount.getPassword() 	%></td>
							<td><%= userAccount.getEmail() 		%></td>
							<td><%= userAccount.getMobile() 	%></td>
						</tr>
					<% } %>
				</table>
			<% } %>			
		</body>
	</html>	
