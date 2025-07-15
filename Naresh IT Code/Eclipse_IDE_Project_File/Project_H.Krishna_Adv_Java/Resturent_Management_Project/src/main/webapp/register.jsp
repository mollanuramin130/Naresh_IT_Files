


<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/components/header.jsp"%>

<div class="container d-flex justify-content-center align-items-center"
	style="min-height: 90vh;">
	<div class="card shadow-lg p-4" style="width: 100%; max-width: 480px;">
		<h3 class="text-center text-success mb-4">Staff Registration</h3>

		<c:if test="${not empty errorMsg}">
			<div class="alert alert-danger">${errorMsg}</div>
		</c:if>

		<c:if test="${not empty successMsg}">
			<div class="alert alert-success">${successMsg}</div>
		</c:if>


		<form action="RegisterServlet" method="post">
			<div class="mb-3">
				<label for="name" class="form-label">Full Name</label> <input
					type="text" class="form-control" id="name" name="name" required
					placeholder="Enter full name">
			</div>

			<div class="mb-3">
				<label for="username" class="form-label">Username (Email or
					ID)</label> <input type="text" class="form-control" id="username"
					name="username" required placeholder="Enter username">
			</div>

			<div class="mb-3">
				<label for="password" class="form-label">Password</label> <input
					type="password" class="form-control" id="password" name="password"
					required placeholder="Enter password">
			</div>

			<div class="d-grid">
				<button type="submit" class="btn btn-success">Register</button>
			</div>

			<div class="text-center mt-3">
				Already registered? <a href="index.jsp">Login here</a>
			</div>
		</form>
	</div>
</div>

<%@ include file="/components/footer.jsp"%>
