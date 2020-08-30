<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
table, td, th {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<head>
<meta charset="UTF-8">
<title>contact</title>
</head>
<body>
<br><br><br>
<center>
<table>
<tr>
<th>Username</th>
<th>Number</th>
<th>Email ID</th>
</tr>
<tr>
<td>${user_name}</td>
<td>${mobile_number}</td>
<td>${email_id}</td>
</tr>
</table><br>
<form action="index.jsp">
<button type="submit">logout</button></form>
<a href="product.jsp">back</a>
</center>
</body>
</html>