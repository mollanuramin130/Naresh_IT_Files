<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ page import="java.util.*, com.ssn.project.AddToCartServlet.Product" %>
<!DOCTYPE html>
<html>
<head>
    <title>Checkout - SSN Market</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>

<jsp:include page="navbar.jsp" />

<div class="container mt-5">
    <h2 class="mb-4 text-center"><i class="fas fa-cash-register"></i> Checkout</h2>

    <%
        List<Product> cart = (List<Product>) session.getAttribute("cart");
        double total = 0;

        if (cart == null || cart.isEmpty()) {
    %>
        <div class="alert alert-info text-center">
            Your cart is empty. <a href="index.jsp">Continue shopping</a>.
        </div>
    <%
        } else {
    %>
    <table class="table table-bordered table-hover">
        <thead class="table-primary">
            <tr>
                <th>#</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Price (₹)</th>
            </tr>
        </thead>
        <tbody>
            <%
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
            <tr class="table-success">
                <td colspan="3" class="text-end"><strong>Total:</strong></td>
                <td><strong>₹<%= String.format("%.2f", total) %></strong></td>
            </tr>
        </tbody>
    </table>

    <!-- Checkout Form -->
    <h4 class="mt-4">Shipping Information</h4>
    <form action="PlaceOrderServlet" method="post" class="row g-3">
        <div class="col-md-6">
            <label class="form-label">Full Name</label>
            <input type="text" name="fullname" class="form-control" required placeholder="Your name">
        </div>
        <div class="col-md-6">
            <label class="form-label">Email</label>
            <input type="email" name="email" class="form-control" required placeholder="you@example.com">
        </div>
        <div class="col-md-12">
            <label class="form-label">Address</label>
            <textarea name="address" class="form-control" rows="3" required placeholder="Street, City, State, ZIP"></textarea>
        </div>
        <div class="col-md-6">
            <label class="form-label">Phone</label>
            <input type="text" name="phone" class="form-control" required placeholder="Mobile number">
        </div>
        <div class="col-md-6">
            <label class="form-label">Payment Method</label>
            <select name="payment" class="form-select" required>
                <option value="">Select</option>
                <option value="cod">Cash on Delivery</option>
                <option value="upi">UPI</option>
                <option value="card">Credit/Debit Card</option>
            </select>
        </div>
        <div class="col-md-12 text-end">
            <button type="submit" class="btn btn-success">
                <i class="fas fa-check-circle"></i> Place Order
            </button>
        </div>
    </form>
    <% } %>
</div>

<!-- Footer -->
<footer class="text-center mt-5 mb-3">
    <p>&copy; 2025 SSN Market. All rights reserved.</p>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
