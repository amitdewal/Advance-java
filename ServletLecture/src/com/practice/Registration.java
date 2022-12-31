package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("WELCOME TO SERVLET");

		String user = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_cousre");
		String condition = request.getParameter("condition");
		
		
		
		 
		/*
		 * To check data is coming to backend or not by printing on console
		 * 
		 * System.out.println(user); System.out.println(password);
		 * System.out.println(email); System.out.println(gender);
		 * System.out.println(course); System.out.println(condition);
		 */
		if (condition != null) {

			if (condition.equals("checked")) {
				out.print("<h2>Name :"+user+"</h2>");
				out.print("<h2>Password :"+password+"</h2>");
				out.print("<h2>Email :"+email+"</h2>");
				out.print("<h2>Gender :"+gender+"</h2>");
				out.print("<h2>Course :"+course+"</h2>");
				//out.print("<h2>Condition :"+condition+"</h2>");
				
				 RequestDispatcher rd = request.getRequestDispatcher("success");
				 rd.forward(request, response);

			} else {
				out.print("<h2>you have not accepted the terms and conditions</h2>");
			}
		}else {
			out.print("<h2>you have not accepted the terms and conditions</h2>");
		
		       // want to include o/p of index.html
			
			     RequestDispatcher rd = request.getRequestDispatcher("index.html");
			      rd.include(request, response);
		 }
	}

}
