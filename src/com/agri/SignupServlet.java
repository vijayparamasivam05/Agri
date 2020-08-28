package com.agri;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("user_name");
		long mobile_number=Long.parseLong(request.getParameter("mobile_number"));
		String password =request.getParameter("password");
		String email =request.getParameter("email_id");
		User user = new User();
		user.setUser_name(name);
		user.setEmail_id(email);
		user.setPassword(password);
		user.setMobile_number(mobile_number);
		
		UserDAO dao = new UserDAO();
		try{
		dao.addUser(user);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
