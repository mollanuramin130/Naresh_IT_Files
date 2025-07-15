<%@ include file="/components/header.jsp" %>
<%@ include file="/components/navbar-admin.jsp" %>

<div class="container my-5">
    <h3 class="text-center text-primary mb-4">Add New Product</h3>

    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
		<form action="${pageContext.request.contextPath}/add-product" method="post" class="border rounded p-4 shadow-sm bg-light">

                <div class="mb-3">
                    <label for="name" class="form-label">Product Name</label>
                    <input type="text" class="form-control" id="name" name="name" required placeholder="e.g., Fresh Mango">
                </div>

                <div class="mb-3">
                    <label for="description" class="form-label">Description</label>
                    <textarea class="form-control" id="description" name="description" rows="3" required placeholder="e.g., Organic Alphonso Mangoes"></textarea>
                </div>

                <div class="mb-3">
                    <label for="price" class="form-label">Price (₹)</label>
                    <input type="number" step="0.01" min="0" class="form-control" id="price" name="price" required>
                </div>

                <div class="mb-3">
                    <label for="image" class="form-label">Image URL / Path</label>
                    <input type="text" class="form-control" id="image" name="imageUrl" required placeholder="e.g., assets/images/mango.jpg">
                </div>

                <div class="text-center">
                    <button type="submit" class="btn btn-success w-50">Add Product</button>
                </div>
            </form>
        </div>
    </div>
</div>

<%@ include file="/components/footer.jsp" %>
