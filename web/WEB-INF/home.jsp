
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Home!</title>
    </head>
    <body>
        <header>
            <h1>Home Page</h1>
        </header>
        <p>Hello ${user.username}</p>
        <br>
        <a href="login">Login</a>
    </body>
</html>
