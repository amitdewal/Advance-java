package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	         System.out.println("this is goGet method......");
	         
	         response.setContentType("text/html");
	         PrintWriter out = response.getWriter();
	         out.print("<h1>this is servlet using HttpServlet.....</h1>");
	         out.print("<h1> "+new Date().toString()+"</h1>");
	         out.print("<h1> "+new Date().toString()+"</h1>");
	         
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
