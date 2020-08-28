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
<title> BUY Page </title>  
</head>
<body>
<h2>Welcome!!!!</h2><br><br>
<center>
<form action="ProductSearchServlet" method="post">
<table>
<tr><td>Product Name:</td>		<td><input type="text" placeholder="Product Name" name="product_name" required></td></tr>
</table><br>
<p style="color:red">${result}</p><br>
<button type="submit">buy</button>
<a href="home.jsp">back</a>
</form>
</center>
</body>
</html>