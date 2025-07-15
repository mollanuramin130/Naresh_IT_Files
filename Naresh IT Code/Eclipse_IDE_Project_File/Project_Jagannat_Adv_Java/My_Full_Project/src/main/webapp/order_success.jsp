<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
    <title>Order Confirmation - SSN Market</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>

<!-- Include Navbar -->
<jsp:include page="navbar.jsp" />

<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-body text-center">
            <h2 class="text-success"><i class="fas fa-check-circle"></i> Thank You for Your Order!</h2>
            <p class="lead mt-3">Hi <strong><%= session.getAttribute("orderName") != null ? session.getAttribute("orderName") : "Customer" %></strong>, your order has been placed successfully.</p>

            <hr>

            <h4 class="mb-3">Order Summary</h4>
            <ul class="list-group list-group-flush text-start mx-auto" style="max-width: 500px;">
                <li class="list-group-item"><strong>Email:</strong> <%= session.getAttribute("orderEmail") %></li>
                <li class="list-group-item"><strong>Shipping Address:</strong> <%= session.getAttribute("orderAddress") %></li>
                <li class="list-group-item"><strong>Payment Method:</strong> <%= session.getAttribute("orderPayment") %></li>
                <li class="list-group-item"><strong>Total Amount:</strong> ₹ 
                    <%
                        DecimalFormat df = new DecimalFormat("#.00");
                        Object total = session.getAttribute("orderTotal");
                        if (total != null) out.print(df.format(Double.parseDouble(total.toString())));
                        else out.print("0.00");
                    %>
                </li>
            </ul>

            <div class="mt-4">
                <a href="index.jsp" class="btn btn-primary"><i class="fas fa-home"></i> Back to Home</a>
            </div>
        </div>
    </div>
</div>

<!-- Footer -->
<footer class="text-center mt-5 mb-3">
    <p>&copy; 2025 SSN Market. All rights reserved.</p>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
