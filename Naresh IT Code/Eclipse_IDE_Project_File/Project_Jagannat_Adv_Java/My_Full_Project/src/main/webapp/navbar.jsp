<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold" href="index.jsp">SSN Market</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarContent" aria-controls="navbarContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarContent">
            <ul class="navbar-nav mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp"><i class="fas fa-home"></i> Home</a>
                </li>

                <% if (session.getAttribute("username") != null) { %>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#"><i class="fas fa-user-circle"></i> 
                            Welcome, <%= session.getAttribute("username") %>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logout.jsp"><i class="fas fa-sign-out-alt"></i> Logout</a>
                    </li>
                    <li class="nav-item">
                        <img src="user-icon.png" alt="User Icon" style="height:30px; margin-left:10px;" class="rounded-circle">
                    </li>
                <% } else { %>
                    <li class="nav-item">
                        <a class="nav-link" href="login.jsp"><i class="fas fa-sign-in-alt"></i> Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="register.jsp"><i class="fas fa-user-plus"></i> Register</a>
                    </li>
                <% } %>

                <!-- Cart Icon Link (always shown) -->
                <li class="nav-item">
                    <a class="nav-link" href="cart.jsp">
                        <i class="fas fa-shopping-cart"></i> Cart
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>
