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
<h2>Welcome!!!!</h2><br><br>
<center>
<h1>Enter your product</h1>
<form action="ProductSellServlet" method="post">
<table>
<tr><td>Product Name:</td>		<td><input type="text" placeholder="Product Name" name="product_name" required></td></tr>
<tr><td>Product Details:</td>	<td><input type="text" placeholder="Product Details" name="product_details" required></td></tr>
<tr><td>Product Unit:</td>		<td><input type="text" placeholder="Product Unit" name="unit" required></td></tr>
<tr><td>Product Price:</td>		<td><input type="text" placeholder="Product Price" name="price" required></td></tr>

</table><br>
<p style="color:red">${error}</p><br>
<button type="submit">sell</button>
<a href="home.jsp">back</a>
</form>
</center>
</body>
</html>