<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%
    String username = (String) session.getAttribute("username");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>SSN Market - Your Online Grocery Store</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap & Font Awesome -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

    <style>
        body {
            background-color: #f9f9f9;
        }
        .welcome-box {
            background: #fff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 0 12px rgba(0, 0, 0, 0.05);
        }
        .category-card {
            transition: all 0.3s ease-in-out;
        }
        .category-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>

<jsp:include page="navbar.jsp" />

<!-- Welcome Section -->
<!-- 

<div class="container mt-4">
    <div class="welcome-box text-center">
        <% if (username != null) { %>
            <h2>Welcome back, <%= username %>! 🛒</h2>
            <p>Find the best groceries, daily needs, and household items just for you.</p>
        <% } else { %>
            <h2>Welcome to SSN Market! 🥦</h2>
            <p>Login or register to explore thousands of products at unbeatable prices.</p>
        <% } %>
    </div>
</div>
 -->

<!-- Carousel -->
<style>
  /* Make carousel height consistent and responsive */
  #mainCarousel .carousel-item img {
    height: 400px;
    object-fit: cover;
  }

  /* Overlay for caption readability */
  .carousel-caption {
    background: rgba(0, 0, 0, 0.5);
    padding: 1.5rem;
    border-radius: 10px;
  }
</style>

<div id="mainCarousel" class="carousel slide carousel-fade mt-4" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#mainCarousel" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#mainCarousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#mainCarousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>

  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="images/banner1.jpg" class="d-block w-100" alt="Fresh Groceries">
      <div class="carousel-caption d-none d-md-block">
        <h3>Fresh Groceries Delivered</h3>
        <p>From farm to your doorstep with utmost care and quality.</p>
      </div>
    </div>

    <div class="carousel-item">
      <img src="images/banner1.jpg" class="d-block w-100" alt="Daily Essentials">
      <div class="carousel-caption d-none d-md-block">
        <h3>Daily Essentials</h3>
        <p>Everything you need to keep your home running smoothly.</p>
      </div>
    </div>

    <div class="carousel-item">
      <img src="images/banner1.jpg" class="d-block w-100" alt="Best Prices">
      <div class="carousel-caption d-none d-md-block">
        <h3>Best Prices, Great Quality</h3>
        <p>Affordable prices without compromising on quality.</p>
      </div>
    </div>
  </div>

  <button class="carousel-control-prev" type="button" data-bs-target="#mainCarousel" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>

  <button class="carousel-control-next" type="button" data-bs-target="#mainCarousel" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

<!-- Categories Section -->
<style>
    .category-card img {
        height: 200px;             /* Set fixed height */
        object-fit: cover;         /* Crop image to fit */
    }
    .category-card {
        height: 100%;              /* Make all cards same height */
        display: flex;
        flex-direction: column;
        justify-content: space-between;
    }
    .category-card .card-body {
        flex-grow: 1;
        display: flex;
        flex-direction: column;
        justify-content: space-between;
    }
</style>

<div class="container mt-5">
    <h3 class="mb-4 text-center">Shop by Category</h3>
    <div class="row">
        <div class="col-md-3 mb-4">
            <div class="card category-card">
                <img src="images/food1.jpg" class="card-img-top" alt="Fruits">
                <div class="card-body text-center">
                    <h5 class="card-title">Fresh Fruits</h5>
                    <a href="category.jsp?cat=fruits" class="btn btn-outline-success">Shop Now</a>
                </div>
            </div>
        </div>
        <div class="col-md-3 mb-4">
            <div class="card category-card">
                <img src="images/food2.jpg" class="card-img-top" alt="Vegetables">
                <div class="card-body text-center">
                    <h5 class="card-title">Vegetables</h5>
                    <a href="category.jsp?cat=vegetables" class="btn btn-outline-success">Shop Now</a>
                </div>
            </div>
        </div>
        <div class="col-md-3 mb-4">
            <div class="card category-card">
                <img src="images/food3.jpg" class="card-img-top" alt="Dairy">
                <div class="card-body text-center">
                    <h5 class="card-title">Dairy Products</h5>
                    <a href="category.jsp?cat=dairy" class="btn btn-outline-success">Shop Now</a>
                </div>
            </div>
        </div>
        <div class="col-md-3 mb-4">
            <div class="card category-card">
                <img src="images/food4.jpg" class="card-img-top" alt="Snacks">
                <div class="card-body text-center">
                    <h5 class="card-title">Snacks</h5>
                    <a href="category.jsp?cat=snacks" class="btn btn-outline-success">Shop Now</a>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- Featured Products -->
<div class="container mt-5">
    <h3 class="mb-4 text-center">Featured Products</h3>
    <div class="row row-cols-1 row-cols-md-4 g-4">
        <%
            // Dummy loop for showing 8 products - this will be dynamic in real implementation
            for (int i = 1; i <= 8; i++) {
        %>
        <div class="col">
            <div class="card h-100">
                <img src="images/product<%=i%>.jpg" class="card-img-top" alt="Product <%=i%>">
                <div class="card-body">
                    <h5 class="card-title">Product <%=i%></h5>
                    <p class="card-text">High quality item at a great price.</p>
                    <div class="d-flex justify-content-between align-items-center">
                        <span class="text-success fw-bold">&#8377;<%= 50 + (i * 10) %></span>
                        <a href="product.jsp?id=<%=i%>" class="btn btn-sm btn-outline-primary">View</a>
                    </div>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>

<!-- Special Offers -->
<div class="container mt-5 bg-light p-5 rounded">
    <div class="row align-items-center">
        <div class="col-md-6">
            <img src="images/offer.jpg" alt="Special Offer" class="img-fluid rounded">
        </div>
        <div class="col-md-6">
            <h3>Special Weekend Offer! 🎉</h3>
            <p>Get up to 25% off on all fruits and vegetables. Hurry, offer ends soon!</p>
            <a href="offers.jsp" class="btn btn-danger mt-2">Explore Offers</a>
        </div>
    </div>
</div>

<!-- Customer Testimonials -->
<div class="container mt-5">
    <h3 class="mb-4 text-center">What Our Customers Say</h3>
    <div class="row text-center">
        <div class="col-md-4">
            <div class="p-4 bg-white rounded shadow-sm">
                <i class="fas fa-quote-left fa-2x text-primary mb-2"></i>
                <p>"Excellent quality and timely delivery. I'm a regular customer now!"</p>
                <h6 class="text-muted">- Priya Sharma</h6>
            </div>
        </div>
        <div class="col-md-4">
            <div class="p-4 bg-white rounded shadow-sm">
                <i class="fas fa-quote-left fa-2x text-primary mb-2"></i>
                <p>"Great prices and fantastic customer service. Highly recommended!"</p>
                <h6 class="text-muted">- Rajat Kumar</h6>
            </div>
        </div>
        <div class="col-md-4">
            <div class="p-4 bg-white rounded shadow-sm">
                <i class="fas fa-quote-left fa-2x text-primary mb-2"></i>
                <p>"Loved the experience. The app interface is easy and intuitive."</p>
                <h6 class="text-muted">- Neha Gupta</h6>
            </div>
        </div>
    </div>
</div>
<!-- Newsletter Subscription -->
<div class="container mt-5 bg-primary text-white p-5 rounded">
    <div class="row align-items-center">
        <div class="col-md-6">
            <h4>Subscribe to our Newsletter</h4>
            <p>Get exclusive deals and updates directly in your inbox.</p>
        </div>
        <div class="col-md-6">
            <form action="SubscribeServlet" method="post" class="d-flex">
                <input type="email" name="email" class="form-control me-2" placeholder="Enter your email" required>
                <button type="submit" class="btn btn-warning">Subscribe</button>
            </form>
        </div>
    </div>
</div>

<!-- Support / Contact Info -->
<div class="container mt-5 mb-4">
    <h4 class="mb-3">Need Help?</h4>
    <div class="row">
        <div class="col-md-4">
            <h6><i class="fas fa-phone text-primary"></i> Customer Support</h6>
            <p>Call us at +91 9876543210</p>
        </div>
        <div class="col-md-4">
            <h6><i class="fas fa-envelope text-primary"></i> Email Support</h6>
            <p>support@ssnmarket.com</p>
        </div>
        <div class="col-md-4">
            <h6><i class="fas fa-map-marker-alt text-primary"></i> Office Location</h6>
            <p>SSN Market HQ, Kolkata, India</p>
        </div>
    </div>
</div>

<!-- Footer -->
<footer class="bg-dark text-white pt-4 pb-2">
    <div class="container text-center">
        <div class="row">
            <div class="col-md-4 mb-3">
                <h6>SSN Market</h6>
                <p>Your trusted partner for fresh groceries and daily essentials.</p>
            </div>
            <div class="col-md-4 mb-3">
                <h6>Quick Links</h6>
                <ul class="list-unstyled">
                    <li><a href="index.jsp" class="text-white text-decoration-none">Home</a></li>
                    <li><a href="products.jsp" class="text-white text-decoration-none">Products</a></li>
                    <li><a href="contact.jsp" class="text-white text-decoration-none">Contact</a></li>
                </ul>
            </div>
            <div class="col-md-4 mb-3">
                <h6>Follow Us</h6>
                <a href="#" class="text-white me-3"><i class="fab fa-facebook"></i></a>
                <a href="#" class="text-white me-3"><i class="fab fa-twitter"></i></a>
                <a href="#" class="text-white"><i class="fab fa-instagram"></i></a>
            </div>
        </div>
        <p class="mt-3">&copy; 2025 SSN Market. All rights reserved.</p>
    </div>
</footer>

<!-- Bootstrap JS Bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<!-- Session-based Welcome Message -->

<script>
    document.addEventListener("DOMContentLoaded", function () {
        const alert = document.createElement('div');
        alert.className = "alert alert-success alert-dismissible fade show text-center";
        alert.innerHTML = "Welcome back, <strong><%= username %></strong>! <button type='button' class='btn-close' data-bs-dismiss='alert'></button>";
        document.body.prepend(alert);
    });
</script>
<!-- Product Categories -->
<div class="container mt-5">
    <h3 class="mb-4 text-center">Shop by Categories</h3>
    <div class="row text-center">
        <div class="col-md-3 mb-3">
            <div class="border p-3 rounded shadow-sm h-100">
                <i class="fas fa-apple-alt fa-2x text-success mb-2"></i>
                <h6>Fruits</h6>
                <a href="category.jsp?cat=fruits" class="stretched-link"></a>
            </div>
        </div>
        <div class="col-md-3 mb-3">
            <div class="border p-3 rounded shadow-sm h-100">
                <i class="fas fa-carrot fa-2x text-warning mb-2"></i>
                <h6>Vegetables</h6>
                <a href="category.jsp?cat=vegetables" class="stretched-link"></a>
            </div>
        </div>
        <div class="col-md-3 mb-3">
            <div class="border p-3 rounded shadow-sm h-100">
                <i class="fas fa-bread-slice fa-2x text-danger mb-2"></i>
                <h6>Bakery</h6>
                <a href="category.jsp?cat=bakery" class="stretched-link"></a>
            </div>
        </div>
        <div class="col-md-3 mb-3">
            <div class="border p-3 rounded shadow-sm h-100">
                <i class="fas fa-milk fa-2x text-info mb-2"></i>
                <h6>Dairy</h6>
                <a href="category.jsp?cat=dairy" class="stretched-link"></a>
            </div>
        </div>
    </div>
</div>

<!-- Recently Viewed (placeholder) -->
<div class="container mt-5">
    <h4>Recently Viewed Products</h4>
    <p class="text-muted">You haven't viewed any products yet.</p>
</div>

<!-- Floating Cart Button -->
<a href="cart.jsp" class="btn btn-lg btn-success position-fixed bottom-0 end-0 m-4 shadow">
    <i class="fas fa-shopping-cart"></i>
</a>

<!-- Scroll to Top Button -->
<button onclick="window.scrollTo({top: 0, behavior: 'smooth'});" class="btn btn-secondary position-fixed bottom-0 start-0 m-4 shadow">
    <i class="fas fa-arrow-up"></i>
</button>

</body>
</html>


