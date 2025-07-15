<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container my-4">
    <h2 class="text-center mb-4">Our Menu</h2>
    <div class="row">
        <c:choose>
            <c:when test="${not empty products}">
                <c:forEach var="p" items="${products}">
                    <div class="col-md-4 col-lg-3 mb-4">
                        <div class="card h-100 shadow-sm">
                            <img src="${p.imageUrl}" class="card-img-top" alt="${p.name}" style="height:200px; object-fit:cover;">
                            <div class="card-body d-flex flex-column">
                                <h5 class="card-title">${p.name}</h5>
                                <p class="card-text">${p.description}</p>
                                <h6 class="mt-auto">Price: ₹${p.price}</h6>
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
            </c:when>
            <c:otherwise>
                <div class="col-12">
                    <div class="alert alert-info text-center">No products found.</div>
                </div>
            </c:otherwise>
        </c:choose>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
