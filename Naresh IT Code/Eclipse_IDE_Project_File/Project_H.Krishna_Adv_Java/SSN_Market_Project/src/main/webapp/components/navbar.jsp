<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<nav
	class="navbar navbar-expand-lg navbar-dark bg-success shadow-sm sticky-top">
	<div class="container">
		<a class="navbar-brand fw-bold" href="index.jsp"> <i
			class="bi bi-shop-window"></i> SSN Market
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					href="index.jsp">Home</a></li>
				<li class="nav-item">
    <a class="nav-link" href="<c:url value='/menu' />">Menu</a>
</li>

				<li class="nav-item"><a class="nav-link" href="about.jsp">About
						Us</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/contact">Contact</a>

				<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="cart" value="${sessionScope.cart}" />
<c:set var="cartSize" value="${cart != null ? fn:length(cart) : 0}" />

<li class="nav-item">
    <a class="nav-link" href="<c:url value='/cart' />">🛒 Cart<span class="badge bg-light text-dark">${cartSize}</span>
    </a>
</li>
				
				
				<!-- 🔐 Admin Panel Link -->
                <li class="nav-item">
                    <a class="nav-link text-warning" href="<c:url value='/admin-dashboard' />">Admin Panel</a>
                </li>
				<li class="nav-item"><a class="nav-link" href="login.jsp"><i
						class="bi bi-box-arrow-in-right"></i> Login</a></li>
			</ul>
		</div>
	</div>
</nav>
