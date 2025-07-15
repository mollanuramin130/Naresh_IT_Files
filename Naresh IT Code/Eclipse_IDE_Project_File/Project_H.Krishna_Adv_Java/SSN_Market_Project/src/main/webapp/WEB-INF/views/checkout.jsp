<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container mt-4">
    <h3>Checkout</h3>

    <table class="table">
        <thead>
            <tr>
                <th>#</th>
                <th>Item</th>
                <th>Description</th>
                <th>Price</th>
                <th>Qty</th>
                <th>Total</th>
            </tr>
        </thead>
        <tbody>
            <c:set var="grandTotal" value="0" />
            <c:forEach var="item" items="${cart.values()}" varStatus="loop">
                <tr>
                    <td>${loop.index + 1}</td>
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>₹${item.price}</td>
                    <td>${item.quantity}</td>
                    <td>
                        ₹${item.price * item.quantity}
                        <c:set var="grandTotal" value="${grandTotal + (item.price * item.quantity)}" />
                    </td>
                </tr>
            </c:forEach>
            <tr class="table-warning fw-bold">
                <td colspan="5" class="text-end">Grand Total:</td>
                <td>₹${grandTotal}</td>
            </tr>
        </tbody>
    </table>

    <form action="${pageContext.request.contextPath}/PlaceOrderServlet" method="post" class="mt-3">
        <div class="mb-3">
            <label class="form-label">Shipping Address</label>
            <textarea name="address" class="form-control" required></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Place Order</button>
    </form>
</div>

<%@ include file="/components/footer.jsp" %>
