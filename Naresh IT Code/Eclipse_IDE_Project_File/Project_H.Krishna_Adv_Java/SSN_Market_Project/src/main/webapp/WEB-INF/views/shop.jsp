<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="com.ssn.market.model.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="/components/header.jsp"%>
<%@ include file="/components/navbar.jsp"%>

<div class="container my-5">
	<h3 class="text-center mb-4 text-success">Shop Our Products</h3>

	<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-4">
		<c:forEach var="p" items="${products}">
			<div class="col">
				<div class="card h-100 shadow-sm">
					<img src="${p.imageUrl}" class="card-img-top"
						style="height: 200px; object-fit: cover;" alt="${p.name}">
					<div class="card-body">
						<h5 class="card-title">${p.name}</h5>
						<p class="card-text">${p.description}</p>
						<span class="badge bg-primary">₹${p.price}</span>
					</div>
					<div class="card-footer bg-transparent border-0 text-center">
    <form method="post" action="${pageContext.request.contextPath}/addToCart">
    <input type="hidden" name="productId" value="${p.productId}" />
    <button type="submit" class="btn btn-success btn-sm">Add to Cart</button>
</form>

</div>

				</div>
			</div>
		</c:forEach>
	</div>
</div>

<%@ include file="/components/footer.jsp"%>
