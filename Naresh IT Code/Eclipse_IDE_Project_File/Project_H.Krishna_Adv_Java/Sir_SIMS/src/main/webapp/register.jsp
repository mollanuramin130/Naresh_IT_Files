<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create An account</title>
</head>
<body>
	<form action="./UserAccountServlet" method="post">
		<table>
			<tr>
				<td>User ID</td>
				<td><input type="number" name="userid" value="" /></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" value="" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" value="" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" value="" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="tel" name="mobile" value="" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="button"
					value="Register"></td>
			</tr>
		</table>
		<BR>
		<BR> Already have an account? <a href="./login.jsp">Login</a>
		
	</form>
</body>
</html>
