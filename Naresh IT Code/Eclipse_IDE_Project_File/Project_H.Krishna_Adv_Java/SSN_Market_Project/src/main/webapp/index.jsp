<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<!-- Hero Section -->
<div class="bg-light py-5">
    <div class="container text-center">
        <h1 class="display-4 fw-bold text-success">Welcome to SSN Market</h1>
        <p class="lead text-muted">Your one-stop shop for fresh groceries, food items, and daily essentials.</p>
        <a href="shop" class="btn btn-success btn-lg px-4">Shop Now</a>
    </div>
</div>

<!-- Features Section -->
<div class="container py-5">
    <div class="row text-center g-4">
        <div class="col-md-4">
            <div class="shadow-sm p-4 border rounded h-100">
                <i class="bi bi-basket-fill fs-2 text-success mb-3"></i>
                <h5>Fresh Products</h5>
                <p class="text-muted">We deliver the freshest vegetables, fruits, and groceries right to your door.</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="shadow-sm p-4 border rounded h-100">
                <i class="bi bi-truck fs-2 text-success mb-3"></i>
                <h5>Fast Delivery</h5>
                <p class="text-muted">Lightning fast delivery service across your local area with real-time tracking.</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="shadow-sm p-4 border rounded h-100">
                <i class="bi bi-shield-check fs-2 text-success mb-3"></i>
                <h5>Secure Payments</h5>
                <p class="text-muted">We ensure safe and secure online transactions via trusted gateways.</p>
            </div>
        </div>
    </div>
</div>

<!-- Banner Section -->
<div class="container my-5">
    <div class="row align-items-center bg-success text-white p-5 rounded shadow">
        <div class="col-md-8">
            <h3>Need essentials delivered to your doorstep?</h3>
            <p class="mb-0">Order anytime and get your daily items delivered within 60 minutes!</p>
        </div>
        <div class="col-md-4 text-end">
            <a href="shop" class="btn btn-light text-success fw-bold">Start Shopping</a>
            
        </div>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
