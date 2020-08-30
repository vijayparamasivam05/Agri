package com.agri;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ContactServlet")
@SuppressWarnings("serial")
public class ContactServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name =request.getParameter("seller_name");
	
	UserDAO dao = new UserDAO();
	
	try{
		if(dao.checkContact(name))
		{
		User user=dao.getUser(name);
		HttpSession session=request.getSession();  
        session.setAttribute("user_name",user.getUser_name());
        request.setAttribute("user_name",user.getUser_name());
        session.setAttribute("mobile_number",user.getMobile_number());
        request.setAttribute("mobile_number",user.getMobile_number());
        session.setAttribute("email_id",user.getEmail_id());
        request.setAttribute("email_id",user.getEmail_id());
		RequestDispatcher rd = request.getRequestDispatcher("contact.jsp");
		rd.forward(request, response);
		}
		else {
			request.setAttribute("result","result not found");
			RequestDispatcher rd = request.getRequestDispatcher("buy.jsp");
			rd.forward(request, response);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
}
}

