<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.agri.Product"%> 
<%@page import="java.util.ArrayList"%> 
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
<% ArrayList<Product> product_list =(ArrayList<Product>)request.getAttribute("product_list"); 
        for(Product p:product_list){%> 
<tr>
 <td><%=p.getProduct_name()%></td>
 <td><%=p.getProduct_details()%></td>
 <td><%=p.getUnit()%></td>
 <td><%=p.getPrice()%></td>
 <td><%=p.getSeller_name()%></td> 
<td><form action="ContactServlet" method="post">
<input type="hidden" name="seller_name" value=<%=p.getSeller_name()%>>
<button type="submit">contact</button></form>
</td>
</tr>
<%}%> 
</table><br>
<a href="buy.jsp">back</a>
<form action="index.jsp">
<button type="submit">logout</button></form>
</center>
</body>
</html>