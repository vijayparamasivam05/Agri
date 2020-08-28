package com.agri;
import java.io.*;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductSearchServlet")
public class ProductSearchServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product_name =request.getParameter("product_name");
		ProductDAO pdao = new ProductDAO();
		
		try {
			if(pdao.checkProduct(product_name)){
				Product product = pdao.getProduct(product_name);
				HttpSession session=request.getSession();  
			    session.setAttribute("product_name",product.getProduct_name());
			    request.setAttribute("product_name",product.getProduct_name());
			    session.setAttribute("product_details",product.getProduct_details());
			    request.setAttribute("product_details",product.getProduct_details());
			    session.setAttribute("unit",product.getUnit());
			    request.setAttribute("unit",product.getUnit());
			    session.setAttribute("price",product.getPrice());
			    request.setAttribute("price",product.getPrice());
				RequestDispatcher rd = request.getRequestDispatcher("product.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("result","not available");
				RequestDispatcher rd = request.getRequestDispatcher("buy.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
