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
<title>product</title>
</head>
<body>
WELCOME TO PRODUCT PAGE
<br><br><br>
<center>
<table>
<tr>
<th>Product Name</th>
<th>Product Details</th>
<th>Unit</th>
<th>Price</th>
</tr>
<tr>
<td>${product_name}</td>
<td>${product_details}</td>
<td>${unit}</td>
<td>${price}</td>
</tr>
</table><br>
<a href="buy.jsp">back</a>
<form action="index.jsp">
<button type="submit">logout</button></form>
</center>
</body>
</html>