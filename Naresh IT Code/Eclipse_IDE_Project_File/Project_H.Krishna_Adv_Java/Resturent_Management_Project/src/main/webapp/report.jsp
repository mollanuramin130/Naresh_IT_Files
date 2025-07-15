<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container my-5">
    <h2 class="text-center text-info mb-4">Restaurant Reports</h2>

    <!-- Summary Cards -->
    <div class="row text-center mb-4">
        <div class="col-md-4 mb-3">
            <div class="card border-success shadow h-100">
                <div class="card-body">
                    <h5 class="card-title">Total Revenue</h5>
                    <h3 class="text-success">₹24,300</h3>
                </div>
            </div>
        </div>

        <div class="col-md-4 mb-3">
            <div class="card border-primary shadow h-100">
                <div class="card-body">
                    <h5 class="card-title">Total Orders</h5>
                    <h3 class="text-primary">120</h3>
                </div>
            </div>
        </div>

        <div class="col-md-4 mb-3">
            <div class="card border-warning shadow h-100">
                <div class="card-body">
                    <h5 class="card-title">Total Staff</h5>
                    <h3 class="text-warning">7</h3>
                </div>
            </div>
        </div>
    </div>

    <!-- Popular Items Table -->
    <div class="table-responsive shadow-sm">
        <table class="table table-striped table-bordered">
            <thead class="table-dark text-center">
                <tr>
                    <th>Item</th>
                    <th>Orders</th>
                    <th>Revenue (₹)</th>
                </tr>
            </thead>
            <tbody class="text-center">
                <tr>
                    <td>Veggie Pizza</td>
                    <td>50</td>
                    <td>₹9,950</td>
                </tr>
                <tr>
                    <td>Cheese Burger</td>
                    <td>40</td>
                    <td>₹5,960</td>
                </tr>
                <tr>
                    <td>Creamy Pasta</td>
                    <td>30</td>
                    <td>₹5,370</td>
                </tr>
            </tbody>
        </table>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
