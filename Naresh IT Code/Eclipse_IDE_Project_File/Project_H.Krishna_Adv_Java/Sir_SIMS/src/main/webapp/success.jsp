<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Success</title>
		</head>
		<body>
			<% String message = (String)request.getAttribute("success"); %>
			
			<% if(message.toLowerCase().contains("created")) { %>
				<h3 style="color: blue;" align="left">
					<%= message  %> <BR><BR>
				</h3>
				<jsp:include page="./login.jsp"/>
			<%}else if(message.toLowerCase().contains("updated")) { %>
				<jsp:include page="./home.jsp"/>
				
				<h3 style="color: blue;" align="left">
					<%= message  %> <BR><BR>
				</h3>
			<%}else if(message.toLowerCase().contains("deleted")) { %>
				<jsp:include page="./home.jsp"/>
				
				<h3 style="color: blue;" align="left">
					<%= message  %> <BR><BR>
				</h3>
				<a href='./login.jsp'>Login with other user details</a>
			<%} %>

			
		</body>
	</html>
	