<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container mt-4">
    <h3>Order Confirmation</h3>
    <div class="alert alert-success">
        ✅ Thank you! Your order has been placed successfully.
    </div>
    <a href="${pageContext.request.contextPath}/shop" class="btn btn-primary">
        Continue Shopping
    </a>
</div>

<%@ include file="/components/footer.jsp" %>
