<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>JSTL Test</title>
</head>
<body>
    <c:set var="framework" value="JSTL with Tomcat 10"/>
    <h2>Test Result</h2>
    <p>Hello from <strong><c:out value="${framework}"/></strong></p>
</body>
</html>
