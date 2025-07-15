<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Special Offers - SSN Market</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>

<!-- Include Navbar -->
<jsp:include page="navbar.jsp" />

<!-- Offer Banner -->
<div class="container mt-4">
    <div class="text-center bg-warning p-4 rounded-3 shadow-sm">
        <h2 class="fw-bold"><i class="fas fa-tags"></i> Today's Special Offers</h2>
        <p class="mb-0">Don't miss these limited-time deals!</p>
    </div>
</div>

<!-- Offer Cards -->
<div class="container mt-5">
    <div class="row row-cols-1 row-cols-md-3 g-4">

        <!-- Offer 1 -->
        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="images/offer1.jpg" class="card-img-top" alt="Offer 1">
                <div class="card-body">
                    <h5 class="card-title">Buy 1 Get 1 Free - Fresh Apples</h5>
                    <p class="card-text">Get double the freshness with our premium apples. Limited stock!</p>
                    <p class="text-danger fw-bold">Only Today</p>
                    <a href="category.jsp?cat=fruits" class="btn btn-success"><i class="fas fa-shopping-cart"></i> Shop Now</a>
                </div>
            </div>
        </div>

        <!-- Offer 2 -->
        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="images/offer2.jpg" class="card-img-top" alt="Offer 2">
                <div class="card-body">
                    <h5 class="card-title">20% Off on All Dairy Products</h5>
                    <p class="card-text">Grab your dairy essentials at a discounted rate. Offer valid today only.</p>
                    <p class="text-danger fw-bold">Limited Time Offer</p>
                    <a href="category.jsp?cat=dairy" class="btn btn-primary"><i class="fas fa-shopping-basket"></i> View Deals</a>
                </div>
            </div>
        </div>

        <!-- Offer 3 -->
        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="images/offer3.jpg" class="card-img-top" alt="Offer 3">
                <div class="card-body">
                    <h5 class="card-title">Flat ₹50 Off on Orders Over ₹500</h5>
                    <p class="card-text">Apply code <strong>SSN50</strong> at checkout to avail the discount.</p>
                    <p class="text-danger fw-bold">Coupon Valid Till Midnight</p>
                    <a href="index.jsp" class="btn btn-dark"><i class="fas fa-tags"></i> Start Shopping</a>
                </div>
            </div>
        </div>

    </div>
</div>

<!-- Footer -->
<footer class="text-center mt-5 mb-3 text-muted">
    &copy; 2025 SSN Market - All rights reserved.
</footer>

<!-- Bootstrap 5 JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
