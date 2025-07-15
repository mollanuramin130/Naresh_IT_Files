<%@ page import="com.ssn.resturent.pojo.Order" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container my-5">
    <h2 class="text-center text-success mb-4">Admin Dashboard</h2>
<%
    out.println("DEBUG totalOrders: " + request.getAttribute("totalOrders"));
    out.println("<br/>DEBUG latestOrders: " + request.getAttribute("latestOrders"));
%>

    <div class="row text-center mb-5">
        <div class="col-md-4">
            <div class="card shadow-sm p-4">
                <h4>Total Orders</h4>
                <p class="fs-3 text-primary">${totalOrders}</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card shadow-sm p-4">
                <h4>Total Revenue</h4>
                <p class="fs-3 text-success">₹${totalRevenue}</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card shadow-sm p-4">
                <h4>Total Staff</h4>
                <p class="fs-3 text-danger">${totalStaff}</p>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-8">
            <h5 class="mb-3">Latest Orders</h5>
            <table class="table table-bordered table-hover">
                <thead class="table-success">
                    <tr>
                        <th>#ID</th>
                        <th>Item</th>
                        <th>Qty</th>
                        <th>Price</th>
                        <th>Status</th>
                        <th>Time</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="order" items="${latestOrders}">
                        <tr>
                            <td>${order.orderId}</td>
                            <td>${order.itemName}</td>
                            <td>${order.quantity}</td>
                            <td>${order.price}</td>
                            <td>${order.status}</td>
                            <td>${order.orderTime}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="col-md-4">
            <canvas id="barChart"></canvas>
            <canvas id="pieChart" class="mt-5"></canvas>
        </div>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script>
    const ctxBar = document.getElementById('barChart');
    const ctxPie = document.getElementById('pieChart');

    new Chart(ctxBar, {
        type: 'bar',
        data: {
            labels: ['Orders', 'Revenue', 'Staff'],
            datasets: [{
                label: 'Dashboard Summary',
                data: [${totalOrders}, ${totalRevenue}, ${totalStaff}],
                backgroundColor: ['#0d6efd', '#198754', '#dc3545']
            }]
        },
        options: {
            responsive: true,
            plugins: { legend: { display: false } }
        }
    });

    new Chart(ctxPie, {
        type: 'pie',
        data: {
            labels: ['Orders', 'Revenue', 'Staff'],
            datasets: [{
                data: [${totalOrders}, ${totalRevenue}, ${totalStaff}],
                backgroundColor: ['#0d6efd', '#198754', '#dc3545']
            }]
        },
        options: {
            responsive: true
        }
    });
</script>
