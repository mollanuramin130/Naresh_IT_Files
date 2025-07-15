<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container my-5">
    <h2 class="text-center text-success mb-4">Restaurant Menu</h2>

    <div class="row row-cols-2 row-cols-md-3 g-4">
        <!-- Item 1 -->
        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="assets/images/burger.jpg" class="card-img-top img-fluid" alt="Burger" style="height: 200px; object-fit: cover;">
                <div class="card-body">
                    <h5 class="card-title">Cheese Burger</h5>
                    <p class="card-text">Juicy burger with melted cheese and fresh veggies.</p>
                    <span class="badge bg-success">₹149</span>
                </div>
            </div>
        </div>

        <!-- Item 2 -->
        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="assets/images/pizza.jpg" class="card-img-top img-fluid" alt="Pizza" style="height: 200px; object-fit: cover;">
                <div class="card-body">
                    <h5 class="card-title">Veggie Pizza</h5>
                    <p class="card-text">Thin crust pizza with olives, corn and cheese.</p>
                    <span class="badge bg-success">₹199</span>
                </div>
            </div>
        </div>

        <!-- Item 3 -->
        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="assets/images/pasta.jpg" class="card-img-top img-fluid" alt="Pasta" style="height: 200px; object-fit: cover;">
                <div class="card-body">
                    <h5 class="card-title">Creamy Pasta</h5>
                    <p class="card-text">White sauce pasta with mushrooms and cheese.</p>
                    <span class="badge bg-success">₹179</span>
                </div>
            </div>
        </div>

        <!-- Add more items below -->
        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="assets/images/coffee.jpg" class="card-img-top img-fluid" alt="Coffee" style="height: 200px; object-fit: cover;">
                <div class="card-body">
                    <h5 class="card-title">Hot Coffee</h5>
                    <p class="card-text">Freshly brewed coffee with frothy milk.</p>
                    <span class="badge bg-success">₹99</span>
                </div>
            </div>
        </div>

        <div class="col">
            <div class="card h-100 shadow-sm">
                <img src="assets/images/sandwich.jpg" class="card-img-top img-fluid" alt="Sandwich" style="height: 200px; object-fit: cover;">
                <div class="card-body">
                    <h5 class="card-title">Grilled Sandwich</h5>
                    <p class="card-text">Grilled paneer sandwich with veggies and sauces.</p>
                    <span class="badge bg-success">₹129</span>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
