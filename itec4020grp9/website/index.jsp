<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
</head>
<body>
<h1>Login</h1>
<form id="loginForm">
    <div>
        <label for="id">ID:</label>
        <input type="text" id="id" name="id" required>
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    </div>
    <div>
        <input type="submit" value="Login">
    </div>
</form>

<script>
    $(document).ready(function(){
        $("#loginForm").submit(function(event){
            event.preventDefault();
            var id = $("#id").val();
            var password = $("#password").val();
            $.ajax({
                type: "POST",
                url: "/login",
                data: {id: id, password: password},
                success: function(response) {
                    alert("Login successful!");
                    <%--window.location.href = "<%=request.getContextPath()%>/login";--%>
                },
                error: function(response) {
                    alert("Login failed. Please try again.");
                }
            });
        });
    });
</script>
</body>
</html>