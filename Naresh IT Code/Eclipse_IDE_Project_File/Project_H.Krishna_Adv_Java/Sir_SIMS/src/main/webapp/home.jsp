<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Home Page</title>
		</head>
		
		<body>
			<H1>User Actions</H1>
			<form action="./UserAccountServlet" method="post">
				<input type="submit" name="button" value="Get User Details" style="background: cyan;border-color: cyan;">
				<input type="submit" name="button" value="Get All Users"    style="background: pink;border-color: pink;">
				<input type="submit" name="button" value="Update"           style="background: yellow;border-color: yellow;">
				<input type="submit" name="button" value="Delete"           style="background: red;border-color: red;">
			</form>
		</body>
	</html>