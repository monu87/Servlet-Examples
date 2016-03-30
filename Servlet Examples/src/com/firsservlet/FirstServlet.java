package com.firsservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FirstServlet implements Servlet{

	ServletConfig config=null;
	
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		this.config = config;
		System.out.println("*-------------------------------------*");
		System.out.println("Init method initialized");
		System.out.println("*-------------------------------------*");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("*-------------------------------------*");
		System.out.println("Service method called");
		System.out.println("*-------------------------------------*");
		
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		
		out.print("<html><body><b>Hello simple servlet</b><br/><b>Servlet Info :</b>");
		out.print(getServletInfo());
		out.print("<br/><b>Get servlet config object :</b>"+getServletConfig());
		out.print("</body></html>");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("*-------------------------------------*");
		System.out.println("destroy method called");
		System.out.println("*-------------------------------------*");
		
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "Copyright 2015-2016 version-3.0";
	}


}