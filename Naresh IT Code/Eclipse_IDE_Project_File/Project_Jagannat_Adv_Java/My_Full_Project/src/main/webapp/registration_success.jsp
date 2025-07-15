<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Successful - SSN Market</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome for icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>

    <!-- Include Navbar -->
    <jsp:include page="navbar.jsp" />

    <!-- Success Message Section -->
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="alert alert-success text-center shadow-lg p-4 rounded">
                    <h3 class="mb-3"><i class="fas fa-check-circle"></i> Registration Successful!</h3>
                    <p class="lead">Thank you for registering with <strong>SSN Market</strong>.</p>
                    <p>You can now log in and start shopping with us.</p>
                    <a href="login.jsp" class="btn btn-success mt-3"><i class="fas fa-sign-in-alt"></i> Go to Login</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Optional Footer -->
    <footer class="text-center mt-5 mb-3">
        <p>&copy; 2025 SSN Market. All rights reserved.</p>
    </footer>

    <!-- Bootstrap 5 JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
