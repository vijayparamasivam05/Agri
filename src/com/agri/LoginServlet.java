package com.agri;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("user_name");
		String password =request.getParameter("password");
		UserDAO dao = new UserDAO();
		
		try{
			if(dao.checkUser(name,password))
			{
			User user=dao.getUser(name, password);
			//HttpSession session=request.getSession();  
	        //session.setAttribute("user_name",user.getUser_name());
	        request.setAttribute("user_name",user.getUser_name());
	        //session.setAttribute("mobile_number",user.getMobile_number());
	        request.setAttribute("mobile_number",user.getMobile_number());
	        //session.setAttribute("email_id",user.getEmail_id());
	        request.setAttribute("email_id",user.getEmail_id());
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			}
			else {
				request.setAttribute("error","Not a valid username or password");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
	}
}