<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container py-5">
  <div class="row align-items-center">
    <div class="col-lg-6 mb-4">
      <img src="https://source.unsplash.com/600x400/?grocery,market" class="img-fluid rounded shadow" alt="About SSN Market">
    </div>
    <div class="col-lg-6">
      <h2 class="display-5 fw-bold text-primary mb-3">About SSN Market</h2>
      <p class="lead text-muted">
        Welcome to <strong>SSN Market</strong> – your trusted neighborhood grocery store. We provide fresh vegetables, daily essentials, and much more to make your life easier.
      </p>
      <p>
        Our mission is to deliver quality products at affordable prices. With a wide range of items and fast delivery, SSN Market is your one-stop solution for all daily needs.
      </p>
      <ul class="list-unstyled">
        <li><i class="bi bi-check-circle-fill text-success"></i> Fresh groceries delivered to your doorstep</li>
        <li><i class="bi bi-check-circle-fill text-success"></i> Wide range of daily essentials</li>
        <li><i class="bi bi-check-circle-fill text-success"></i> Affordable prices & excellent service</li>
      </ul>
      <a href="${pageContext.request.contextPath}/shop" class="btn btn-success mt-3">
        <i class="bi bi-cart"></i> Start Shopping
      </a>
    </div>
  </div>

  <hr class="my-5">

  <div class="row text-center">
    <div class="col-md-4 mb-4">
      <div class="card shadow-sm border-0 h-100">
        <div class="card-body">
          <i class="bi bi-truck fs-1 text-primary"></i>
          <h5 class="card-title mt-3">Fast Delivery</h5>
          <p class="card-text">Get your orders delivered quickly and safely with our reliable delivery service.</p>
        </div>
      </div>
    </div>
    <div class="col-md-4 mb-4">
      <div class="card shadow-sm border-0 h-100">
        <div class="card-body">
          <i class="bi bi-bag-check fs-1 text-success"></i>
          <h5 class="card-title mt-3">Quality Products</h5>
          <p class="card-text">We guarantee fresh and high-quality products sourced from trusted vendors.</p>
        </div>
      </div>
    </div>
    <div class="col-md-4 mb-4">
      <div class="card shadow-sm border-0 h-100">
        <div class="card-body">
          <i class="bi bi-shield-check fs-1 text-warning"></i>
          <h5 class="card-title mt-3">Secure Payment</h5>
          <p class="card-text">Shop with confidence using our secure and easy payment options.</p>
        </div>
      </div>
    </div>
  </div>
</div>

<%@ include file="/components/footer.jsp" %>
