<%@ page import="java.util.*, com.ssn.resturent.pojo.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container my-5">
    <h3 class="text-center mb-4 text-primary">All Orders</h3>

    <div class="table-responsive">
        <table class="table table-bordered table-striped table-hover">
            <thead class="table-success">
                <tr>
                    <th>Order ID</th>
                    <th>Item</th>
                    <th>Qty</th>
                    <th>Price</th>
                    <th>Status</th>
                    <th>Time</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Order> orderList = (List<Order>) request.getAttribute("orderList");
                    if (orderList != null) {
                        for (Order o : orderList) {
                %>
                <tr>
                    <td><%= o.getOrderId() %></td>
                    <td><%= o.getItemName() %></td>
                    <td><%= o.getQuantity() %></td>
                    <td>₹<%= o.getPrice() %></td>
                    <td>
                        <span class="badge bg-<%= "Completed".equals(o.getStatus()) ? "success" : "warning" %>">
                            <%= o.getStatus() %>
                        </span>
                    </td>
                    <td><%= o.getOrderTime() %></td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <td colspan="6" class="text-center text-danger">No orders found</td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
