<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container d-flex justify-content-center align-items-center" style="min-height: 90vh;">
    <div class="card shadow-lg p-4" style="width: 100%; max-width: 420px;">
        <h3 class="text-center text-primary mb-4">Restaurant Admin Login</h3>

        <form action="LoginServlet" method="post">
            <div class="mb-3">
                <label for="username" class="form-label">Email or Username</label>
                <input type="text" class="form-control" name="username" id="username" required placeholder="Enter your username">
            </div>

            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" name="password" id="password" required placeholder="Enter password">
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Login</button>
            </div>

            <div class="mt-3 text-center text-muted" style="font-size: 0.9rem;">
                * Only staff/admins are allowed to login.
            </div>
        </form>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
