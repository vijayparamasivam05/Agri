<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
table, td{
  border: 0px solid black;
}
</style>
<head>
<meta charset="UTF-8">
<title> Login Page </title>  
</head>
<body>
<h2>Welcome!!!</h2><br><br>
<center>
<h1>Login your account</h1>
<form action="LoginServlet" method="post">
<table>
<tr><td>Username:</td>		<td><input type="text" placeholder="Username" name="user_name" required></td></tr>
<tr><td>Password:</td>		<td><input type="password" placeholder="Password" name="password" required></td></tr>
</table><br>
<p style="color:red">${error}</p><br>
<button type="submit">login</button>
<a href="signup.jsp">singup</a>
</form>
</center>
</body>
</html>