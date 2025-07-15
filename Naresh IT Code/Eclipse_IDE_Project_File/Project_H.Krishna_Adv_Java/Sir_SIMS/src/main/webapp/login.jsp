<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%
	String username = (String) request.getAttribute("username");
	String errorMessage = (String) request.getAttribute("failed");

	if (username == null) {
		username = "";
	}

	if (errorMessage == null) {
		errorMessage = "";
	}
	%>

	<form action="./UserAccountServlet" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" value="<%=username%>" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value=""
					maxlength="32" /></td>
			</tr>
			<tr>
				<td colspan="2" style="color: red"><%=errorMessage%></td>
			</tr>
			<tr>
				<td><input type="submit" name="button" value="Login"></td>
			</tr>
		</table>
		<BR>
	</form>
</body>
</html>
