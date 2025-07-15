<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="<%= request.getContextPath() %>/dashboard.jsp">
            <i class="fa-solid fa-utensils"></i> RestoManage
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item"><a class="nav-link" href="dashboard.jsp">Dashboard</a></li>
                <li class="nav-item"><a class="nav-link" href="menu.jsp">Menu</a></li>
                <li class="nav-item"><a class="nav-link" href="orders.jsp">Orders</a></li>
                <li class="nav-item"><a class="nav-link" href="report.jsp">Reports</a></li>
                <li class="nav-item"><a class="nav-link text-danger" href="logout.jsp"><i class="fa fa-power-off"></i> Logout</a></li>
            </ul>
        </div>
    </div>
</nav>
