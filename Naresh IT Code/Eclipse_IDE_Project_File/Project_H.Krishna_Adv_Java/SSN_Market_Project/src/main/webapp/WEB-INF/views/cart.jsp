<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container my-5">
    <h2 class="text-center mb-4">🛒 Your Shopping Cart</h2>

    <c:choose>
        <c:when test="${empty sessionScope.cart}">
            <div class="alert alert-info text-center">
                <i class="bi bi-cart"></i> Your cart is empty. <a href="shop.jsp" class="btn btn-primary btn-sm ms-2">Go Shopping</a>
            </div>
        </c:when>
        <c:otherwise>
            <form action="UpdateCartServlet" method="post">
                <div class="card shadow-sm">
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table align-middle table-bordered table-hover">
                                <thead class="table-dark">
                                    <tr class="text-center">
                                        <th>#</th>
                                        <th>Item</th>
                                        <th>Description</th>
                                        <th>Price (₹)</th>
                                        <th>Qty</th>
                                        <th>Total (₹)</th>
                                        <th>Actions</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:set var="grandTotal" value="0" />
                                    <c:forEach var="item" items="${sessionScope.cart.values()}" varStatus="loop">
                                        <tr>
                                            <td class="text-center">${loop.index + 1}</td>
                                            <td>
                                                <div class="d-flex align-items-center">
                                                    <c:choose>
                                                        <c:when test="${not empty item.imageUrl}">
                                                            <img src="${item.imageUrl}" alt="${item.name}" width="60" height="60" class="rounded me-2 border">
                                                        </c:when>
                                                        <c:otherwise>
                                                            <img src="images/default-product.jpg" alt="No Image" width="60" height="60" class="rounded me-2 border">
                                                        </c:otherwise>
                                                    </c:choose>
                                                    <div>
                                                        <strong>${item.name}</strong>
                                                    </div>
                                                </div>
                                            </td>
                                            <td>${item.description}</td>
                                            <td class="text-end">₹${item.price}</td>
                                            <td style="width: 120px;">
                                                <input type="number" class="form-control text-center" name="quantity_${item.id}" value="${item.quantity}" min="1">
                                            </td>
                                            <td class="text-end">
                                                ₹${item.price * item.quantity}
                                                <c:set var="grandTotal" value="${grandTotal + (item.price * item.quantity)}" />
                                            </td>
                                            <td class="text-center">
                                                <a href="RemoveFromCartServlet?id=${item.id}" class="btn btn-sm btn-outline-danger">
                                                    <i class="bi bi-trash"></i> Remove ${item.id}
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    <tr class="table-warning fw-bold">
                                        <td colspan="5" class="text-end">Grand Total:</td>
                                        <td colspan="2" class="text-end">₹${grandTotal}</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <div class="d-flex justify-content-between mt-4">
                    <button type="submit" class="btn btn-primary">
                        <i class="bi bi-arrow-repeat"></i> Update Cart
                    </button>
                    <a href="CheckoutServlet" class="btn btn-success">
                        <i class="bi bi-credit-card"></i> Proceed to Checkout
                    </a>
                </div>
            </form>
        </c:otherwise>
    </c:choose>
</div>

<%@ include file="/components/footer.jsp" %>
