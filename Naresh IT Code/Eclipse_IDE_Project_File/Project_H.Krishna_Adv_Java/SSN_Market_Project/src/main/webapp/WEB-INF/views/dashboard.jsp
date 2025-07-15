<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar-admin.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${not empty param.success}">
    <div class="alert alert-success alert-dismissible fade show" role="alert">
        ${param.success}
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>
</c:if>
<script>
    setTimeout(() => {
        const alert = document.querySelector('.alert');
        if (alert) {
            alert.classList.remove('show');
            alert.classList.add('fade');
        }
    }, 3000); // 3 seconds
</script>


<div class="container mt-5">
    <h2 class="text-center mb-4 text-success">Admin Dashboard</h2>

    <!-- Dashboard Cards -->
    <div class="row mb-4 text-white">
        <div class="col-md-4 mb-3">
            <div class="card bg-primary shadow-sm">
                <div class="card-body text-center">
                    <h4 class="card-title">Total Orders</h4>
                    <p class="display-6 fw-bold">${totalOrders}</p>
                </div>
            </div>
        </div>

        <div class="col-md-4 mb-3">
            <div class="card bg-success shadow-sm">
                <div class="card-body text-center">
                    <h4 class="card-title">Total Revenue</h4>
                    <p class="display-6 fw-bold">₹${totalRevenue}</p>
                </div>
            </div>
        </div>

        <div class="col-md-4 mb-3">
            <div class="card bg-warning shadow-sm">
                <div class="card-body text-center">
                    <h4 class="card-title">Total Staff</h4>
                    <p class="display-6 fw-bold">${totalStaff}</p>
                </div>
            </div>
        </div>
    </div>

    <!-- Charts Section -->
    <div class="row mb-5">
        <div class="col-md-6">
            <div class="card shadow-sm">
                <div class="card-header bg-dark text-white text-center">
                    Order Status Overview
                </div>
                <div class="card-body">
                    <canvas id="orderChart"></canvas>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="card shadow-sm">
                <div class="card-header bg-dark text-white text-center">
                    Revenue Breakdown
                </div>
                <div class="card-body">
                    <canvas id="revenueChart"></canvas>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>

<!-- Chart.js CDN -->
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<!-- Dashboard Chart Script -->
<script>
    const orderLabels = ${orderLabels};
    const orderCounts = ${orderCounts};

    const revenueLabels = ${revenueLabels};
    const revenueData = ${revenueData};

    // Order Chart
    const ctx1 = document.getElementById('orderChart').getContext('2d');
    new Chart(ctx1, {
        type: 'bar',
        data: {
            labels: orderLabels,
            datasets: [{
                label: 'Order Count',
                data: orderCounts,
                backgroundColor: ['#0d6efd', '#ffc107', '#dc3545']
            }]
        },
        options: {
            responsive: true,
            plugins: {
                legend: { display: false },
                title: {
                    display: true,
                    text: 'Orders by Status',
                    font: { size: 18 }
                }
            }
        }
    });

    // Revenue Chart
    const ctx2 = document.getElementById('revenueChart').getContext('2d');
    new Chart(ctx2, {
        type: 'pie',
        data: {
            labels: revenueLabels,
            datasets: [{
                label: 'Revenue',
                data: revenueData,
                backgroundColor: [
                    '#198754', '#fd7e14', '#6610f2', '#20c997', '#dc3545', '#0dcaf0'
                ]
            }]
        },
        options: {
            responsive: true,
            plugins: {
                title: {
                    display: true,
                    text: 'Revenue by Item',
                    font: { size: 18 }
                }
            }
        }
    });
</script>
