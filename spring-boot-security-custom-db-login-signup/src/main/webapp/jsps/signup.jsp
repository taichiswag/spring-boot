<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4">Signup Form</h2>
        <form action="registerUser" method="post">
            <!-- Name Field -->
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>

            <!-- Email Field -->
            <div class="mb-3">
                <label for="mailId" class="form-label">Email address</label>
                <input type="email" class="form-control" id="mailId" name="mailId" required>
            </div>

            <!-- Password Field -->
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>

            <!-- Roles Checkboxes -->
            <div class="mb-3">
                <label class="form-label">Roles</label>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="ENGINEER" id="roleEngineer" name="roles">
                    <label class="form-check-label" for="roleEngineer">Engineer</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="TX_MANAGER" id="roleTxManager" name="roles">
                    <label class="form-check-label" for="roleTxManager">Transaction Manager</label>
                </div>
            </div>

            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <!-- Submit Button -->
            <button type="submit" class="btn btn-primary">Sign Up</button>
        </form>
    </div>

    <!-- Bootstrap JS (Optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>