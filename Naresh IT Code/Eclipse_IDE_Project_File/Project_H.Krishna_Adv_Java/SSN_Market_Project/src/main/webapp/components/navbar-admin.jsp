<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a href="<c:url value='/admin-dashboard' />" class="navbar-brand">Admin Panel</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#adminNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="adminNavbar">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/admin-dashboard' />">Dashboard</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/add-product' />">Add Product</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/view-orders' />">View Orders</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/staff' />">Staff</a>
                </li>
            </ul>

            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link text-danger" href="<c:url value='/logout' />">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
