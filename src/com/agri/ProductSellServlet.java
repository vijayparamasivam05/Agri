package com.agri;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/ProductSellServlet")
public class ProductSellServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String product_name =request.getParameter("product_name");
	String product_details =request.getParameter("product_details");
	int unit=Integer.parseInt(request.getParameter("unit"));
	int price=Integer.parseInt(request.getParameter("price"));
	HttpSession session=request.getSession();
	String seller_name = (String) session.getAttribute("user_name");
	//String seller_name = request.getParameter("user_name");
	System.out.println("value of Seller:"+ seller_name);
	Product product= new Product();
	product.setProduct_name(product_name);
	product.setProduct_details(product_details);
	product.setUnit(unit);
	product.setPrice(price);
	product.setSeller_name(seller_name);
	//System.out.println("value of Seller:"+ product.getSeller_name());
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
