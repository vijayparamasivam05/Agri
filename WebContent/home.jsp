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
<title>home</title>
</head>
<body>
WELCOME TO HOME PAGE
<br><br><br>
<center>
<form action="index.jsp">
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
<button type="submit">logout</button>
</center>
</body>
</html>