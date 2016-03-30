package com.genericsevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo extends GenericServlet{
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException 
	{
		

	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		System.out.println("init method called");
		
		//response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
	
		out.print("<html><body>");
		out.print("<h>hello Genericservlet example</h>");
		out.print("</body></html>");
		
	}

	public void destroy() 
	{
		
	}

	
}
