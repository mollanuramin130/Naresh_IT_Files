<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ page import="java.util.*" %>

<%
    String category = request.getParameter("cat");
    if (category == null || category.trim().isEmpty()) {
        response.sendRedirect("index.jsp");
        return;
    }

    // Capitalize first letter
    String displayCategory = category.substring(0, 1).toUpperCase() + category.substring(1).toLowerCase();
%>
<!DOCTYPE html>
<html>
<head>
    <title><%= displayCategory %> Products - SSN Market</title>
    <!-- Bootstrap 5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>

<!-- Navbar -->
<jsp:include page="navbar.jsp" />

<!-- Category Header -->
<div class="container mt-4">
    <div class="alert alert-info text-center fs-4 fw-semibold">
        Showing Products for Category: <%= displayCategory %>
    </div>
</div>

<!-- Product Grid -->
<div class="container mt-3">
    <div class="row row-cols-1 row-cols-md-4 g-4">

        <!-- Placeholder Cards - Replace with JDBC product loop later -->
        <%
            for (int i = 1; i <= 8; i++) {
        %>
        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="images/<%= category %><%= i %>.jpg" class="card-img-top" alt="<%= displayCategory %> Product <%= i %>">
                <div class="card-body">
                    <h5 class="card-title"><%= displayCategory %> Product <%= i %></h5>
                    <p class="card-text">High quality <%= displayCategory.toLowerCase() %> item. Fresh and affordable.</p>
                    <p class="text-success fw-bold">₹<%= 20 + i * 5 %>.00</p>
                    <form action="AddToCartServlet" method="post">
                        <input type="hidden" name="productId" value="<%= i %>">
                        <input type="hidden" name="category" value="<%= category %>">
                        <button class="btn btn-sm btn-primary w-100"><i class="fas fa-cart-plus"></i> Add to Cart</button>
                    </form>
                </div>
            </div>
        </div>
        <%
            }
        %>

    </div>
</div>

<!-- Back to Home -->
<div class="container text-center mt-5">
    <a href="index.jsp" class="btn btn-outline-secondary"><i class="fas fa-home"></i> Back to Home</a>
</div>

<!-- Footer -->
<footer class="text-center mt-5 mb-3 text-muted">
    &copy; 2025 SSN Market - All rights reserved.
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
