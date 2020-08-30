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
<th>seller_name</th>
</tr>
<tr>
<td>${product_name}</td>
<td>${product_details}</td>
<td>${unit}</td>
<td>${price}</td>
<td>${seller_name}</td>
<td><form action="ContactServlet" method="post">
<input type="hidden" name="seller_name" value=${seller_name}>
<button type="submit">contact</button></form>
</td>
</tr>
</table><br>
<a href="buy.jsp">back</a>
<form action="index.jsp">
<button type="submit">logout</button></form>
</center>
</body>
</html>