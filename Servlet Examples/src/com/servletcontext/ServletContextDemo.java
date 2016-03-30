package com.servletcontext;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		ServletContext context=getServletContext();
		PrintWriter out = response.getWriter();
		
		Enumeration<String> enu = context.getInitParameterNames();
		while (enu.hasMoreElements()) {
			String paramName = (String) enu.nextElement();
			String paramValue =context.getInitParameter(paramName);
			
			out.print("<br>"+paramName+" : "+paramValue);
			
		}
		
		
		
		

	}

}
