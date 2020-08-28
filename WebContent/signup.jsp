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
<title>Sign-up page</title>
</head>
<body>
<center>
<h2>Sign up here!!!</h2><br>
<form action="SignupServlet" method="post">
<table>
<tr><td>Username:</td>		<td><input type="text" placeholder="Username" name="user_name" required></td></tr>
<tr><td>Password:</td>		<td><input type="password" placeholder="Password" name="password" required></td></tr>
<tr><td>Mobile number:</td> <td><input type="text" placeholder="Mobile number" name="mobile_number" required></td></tr>
<tr><td>Email ID:</td>		<td><input type="text" placeholder="Email ID" name="email_id" required></td></tr>
</table><br>
<button type="submit">singup</button>
<a href="index.jsp">back</a>
</form>
</center>
</body>
</html>