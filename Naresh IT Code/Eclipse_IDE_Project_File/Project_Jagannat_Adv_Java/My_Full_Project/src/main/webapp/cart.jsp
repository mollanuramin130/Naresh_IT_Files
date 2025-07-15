<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ page import="java.util.*, com.ssn.project.AddToCartServlet.Product" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Cart - SSN Market</title>

    <!-- Bootstrap 5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>

<!-- Include Navbar -->
<jsp:include page="navbar.jsp" />

<div class="container mt-5">
    <h2 class="mb-4"><i class="fas fa-shopping-cart"></i> My Cart</h2>

    <%
        List<Product> cart = (List<Product>) session.getAttribute("cart");

        if (cart == null || cart.isEmpty()) {
    %>
        <div class="alert alert-info text-center">
            Your cart is empty. <a href="index.jsp">Start shopping</a>!
        </div>
    <%
        } else {
    %>

    <div class="table-responsive">
        <table class="table table-bordered align-middle text-center">
            <thead class="table-dark">
                <tr>
                    <th>#</th>
                    <th>Product</th>
                    <th>Category</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <%
                    double total = 0.0;
                    int count = 1;
                    for (Product p : cart) {
                        total += p.getPrice();
                %>
                <tr>
                    <td><%= count++ %></td>
                    <td><%= p.getName() %></td>
                    <td><%= p.getCategory() %></td>
                    <td>₹<%= String.format("%.2f", p.getPrice()) %></td>
                </tr>
                <% } %>
                <tr class="table-secondary fw-bold">
                    <td colspan="3" class="text-end">Total</td>
                    <td>₹<%= String.format("%.2f", total) %></td>
                </tr>
            </tbody>
        </table>
    </div>

    <div class="text-end mt-3">
        <a href="checkout.jsp" class="btn btn-success"><i class="fas fa-credit-card"></i> Proceed to Checkout</a>
    </div>

    <% } %>
</div>

<!-- Bootstrap 5 JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
