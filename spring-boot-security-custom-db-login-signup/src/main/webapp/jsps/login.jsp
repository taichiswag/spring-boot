<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<div class="row">
<a href="signup">Signup</a><br/>
<c:if test="${param.error ne null}">
<h3 class="alert alert-danger">Either UserName or Password is invalid.</h3>
</c:if>
</div>
<div class="row">
<c:if test="${param.logout ne null}">
<h3 class="alert alert-success">You have successfully logged out.</h3>
</c:if>
</div>
<div class="row">
<form action="login" method="post" class="form form-horizontal">
<label>UserName</label>
<input type="text" name="username" class="form-control">
</div>
<div class="form-group">
<label>Password</label>
<input type="password" name="password" class="form-control">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</div>
<div class="form-group">
<button type="submit" class="btn btn-primary">Login</button>
</div>
</form>
</div>
</body>
</html>