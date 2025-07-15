<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ page import="java.util.*, java.text.*" %>
<%
    // Sample data for demonstration — replace with database logic
    String productIdStr = request.getParameter("id");
    int productId = (productIdStr != null) ? Integer.parseInt(productIdStr) : -1;

    // Mock product data
    String productName = "Fresh Organic Milk";
    String productDesc = "High-quality fresh milk from local farms. 1 litre pack.";
    double productPrice = 55.0;
    String productImage = "images/milk.jpg";
    String productCategory = "dairy";

    if (productId == 2) {
        productName = "Premium Cow Ghee";
        productDesc = "Pure cow ghee with rich aroma and flavor.";
        productPrice = 299.0;
        productImage = "images/ghee.jpg";
        productCategory = "dairy";
    }

    DecimalFormat df = new DecimalFormat("₹0.00");
%>
<!DOCTYPE html>
<html>
<head>
    <title><%= productName %> - SSN Market</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>

<!-- Include Navbar -->
<jsp:include page="navbar.jsp" />

<!-- Product Details Section -->
<div class="container mt-5 mb-5">
    <div class="row g-5">
        <!-- Product Image -->
        <div class="col-md-6 text-center">
            <img src="<%= productImage %>" class="img-fluid rounded shadow-sm" alt="<%= productName %>">
        </div>

        <!-- Product Info -->
        <div class="col-md-6">
            <h2 class="fw-bold mb-3"><%= productName %></h2>
            <p class="text-muted"><i class="fas fa-tag"></i> Category: <%= productCategory %></p>
            <h4 class="text-success"><%= df.format(productPrice) %></h4>

            <p class="mt-4"><%= productDesc %></p>

            <!-- Add to Cart Form -->
            <form action="AddToCartServlet" method="post" class="mt-4">
                <input type="hidden" name="productId" value="<%= productId %>">
                <input type="hidden" name="category" value="<%= productCategory %>">
                <button type="submit" class="btn btn-primary btn-lg">
                    <i class="fas fa-cart-plus"></i> Add to Cart
                </button>
            </form>
        </div>
    </div>
</div>

<!-- Footer -->
<footer class="text-center mt-5 text-muted">
    &copy; 2025 SSN Market. All rights reserved.
</footer>

<!-- Bootstrap 5 JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
