<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
* SQL> desc user_sims;

Name        Null?       Type            
___________ ___________ _______________ 
USER_ID     NOT NULL    NUMBER(6)       
FULLNAME    NOT NULL    VARCHAR2(30)    
USERNAME    NOT NULL    VARCHAR2(30)    
EMAIL                   VARCHAR2(50)    
PHONE       NOT NULL    VARCHAR2(15)    
ADDRESS                 VARCHAR2(60)    
DOB                     DATE            
PASSWORD    NOT NULL    VARCHAR2(20)  
 */
 --%>
	<h1>Register form</h1>
	<form action="UserAccountServlet" method="get">
        <table>
            <tr>
                <td>Full Name:</td>
                <td><input type="text" name="fullname" required></td>
            </tr>
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username" required></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><input type="text" name="phone" required></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>Date of Birth:</td>
                <td><input type="date" name="dob"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="register" name="action" ></td>
            </tr>
        </table>	
</body>
</html>