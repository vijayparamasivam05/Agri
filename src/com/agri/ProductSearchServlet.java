package com.agri;
import java.io.*;
import java.util.ArrayList;

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
			ArrayList<Product> product_list = new ArrayList<Product>();
			product_list = pdao.getProductList(product_name);
			if(product_list.isEmpty()) {
				request.setAttribute("result","not available");
				RequestDispatcher rd = request.getRequestDispatcher("buy.jsp");
				rd.forward(request, response);
			}
			else {
				HttpSession session=request.getSession();  
			    session.setAttribute("product_list",product_list);
			    request.setAttribute("product_list",product_list);
			    RequestDispatcher rd = request.getRequestDispatcher("product.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
