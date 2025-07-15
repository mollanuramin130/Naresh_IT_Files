<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<footer class="bg-dark text-white text-center py-4 mt-auto">
  <div class="container">
    <p class="mb-1">&copy; <span id="year"></span> SSN Market. All rights reserved.</p>
    <p>
      <i class="bi bi-facebook mx-1"></i>
      <i class="bi bi-instagram mx-1"></i>
      <i class="bi bi-twitter mx-1"></i>
    </p>
  </div>
</footer>

<!-- Bootstrap Bundle JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<!-- Custom JS -->
<script>
  document.getElementById("year").textContent = new Date().getFullYear();
</script>

</body>
</html>
