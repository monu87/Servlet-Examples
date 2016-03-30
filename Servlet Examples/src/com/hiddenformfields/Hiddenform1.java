package com.hiddenformfields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hiddenform1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username= request.getParameter("user");
		out.print("welcome "+username+"<br>");
		
		out.print("<form action='hidden2'>");
		out.print("<input type='hidden' name='user' value='"+username+"'>");
		out.print("<br><input type='submit' value='go'></form>");
		out.close();
	}

}
