package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("this is success servlet");
	    out.println("<h2>Successfully resgistered</h2>");
	}

}
