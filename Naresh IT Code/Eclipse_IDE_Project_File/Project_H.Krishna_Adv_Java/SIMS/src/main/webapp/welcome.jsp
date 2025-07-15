<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.ssn.model.pojo.UserAccountPOJO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	UserAccountPOJO userAccountPOJO=(UserAccountPOJO) session.getAttribute("userAccountPOJO");
    if (userAccountPOJO == null) {
        System.out.println("UserAccountPOJO is null");
        response.sendRedirect("login.jsp");
        return;
    }else{
    	
	        	System.out.println("User Full Name: " + userAccountPOJO.getFullName());
	        	String userFullName = userAccountPOJO.getFullName();
	        	if (userFullName != null) {%>
	        	
	        	<h1>Welcome Mr. <%=userFullName%> to the System</h1><% 
            		System.out.println("User Name: " + userFullName);
            	} else {
            		System.out.println("User Name is not set in session.");
            	}
	        	
    }
%>

</body>
</html>