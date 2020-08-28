package com.agri;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/ProductSellServlet")
public class ProductSellServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String product_name =request.getParameter("product_name");
	String product_details =request.getParameter("product_details");
	int unit=Integer.parseInt(request.getParameter("unit"));
	int price=Integer.parseInt(request.getParameter("price"));
	
	Product product= new Product();
	product.setProduct_name(product_name);
	product.setProduct_details(product_details);
	product.setUnit(unit);
	product.setPrice(price);
	
	ProductDAO pdao = new ProductDAO();
	try{
	pdao.addProduct(product);
	
	RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
	rd.forward(request, response);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
  }

}
