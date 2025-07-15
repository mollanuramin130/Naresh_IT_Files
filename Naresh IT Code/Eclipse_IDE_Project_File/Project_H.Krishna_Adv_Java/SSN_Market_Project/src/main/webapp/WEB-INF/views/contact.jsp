<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar.jsp" %>

<div class="container py-5">
    <div class="text-center mb-5">
        <h1 class="display-5 fw-bold text-primary">Contact Us</h1>
        <p class="lead text-muted">We'd love to hear from you. Reach out any time!</p>
    </div>

    <div class="row g-4">
        <!-- Contact Info -->
        <div class="col-md-6">
            <div class="bg-light rounded p-4 shadow-sm h-100">
                <h4 class="mb-3 text-success"><i class="bi bi-info-circle-fill"></i> Get in Touch</h4>
                <p class="text-muted">For any questions or assistance, please use the form or contact details below.</p>
                <ul class="list-unstyled">
                    <li class="mb-2">
                        <i class="bi bi-envelope-fill text-primary me-2"></i>
                        <strong>Email:</strong> support@ssnmarket.com
                    </li>
                    <li class="mb-2">
                        <i class="bi bi-telephone-fill text-primary me-2"></i>
                        <strong>Phone:</strong> +91 9876543210
                    </li>
                    <li class="mb-2">
                        <i class="bi bi-geo-alt-fill text-primary me-2"></i>
                        <strong>Address:</strong> 123 SSN Market Street, Your City
                    </li>
                </ul>
                <img src="https://source.unsplash.com/400x250/?market,shop" alt="Market" class="img-fluid rounded mt-3 shadow">
            </div>
        </div>

        <!-- Contact Form -->
        <div class="col-md-6">
            <div class="bg-white rounded p-4 shadow-sm border">
                <h4 class="mb-3 text-success"><i class="bi bi-pencil-square"></i> Send a Message</h4>
                <form>
                    <div class="mb-3">
                        <label class="form-label">Your Name</label>
                        <input type="text" class="form-control" placeholder="Enter your name" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Email Address</label>
                        <input type="email" class="form-control" placeholder="you@example.com" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Your Message</label>
                        <textarea class="form-control" rows="4" placeholder="Type your message here" required></textarea>
                    </div>
                    <button type="submit" class="btn btn-success w-100">
                        <i class="bi bi-send"></i> Send Message
                    </button>
                </form>
            </div>
        </div>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
