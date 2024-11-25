<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>ZEE-ZEE Web Portal</title>
    <style>
        body {
            background-color: lavender;
        }
    </style>
</head>
<body>
    <center>
        <h1>ZEE-ZEE Web Portal</h1>
    </center>
    <form id="login" action="submitlogin" method="POST">
        <label for="userName">User Name:</label>
        <input type="text" name="userName" id="userName" required />
        <br/>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required />
        <br/>
        <input type="submit" value="Login" id="submit" />
    </form>
</body>
</html>
