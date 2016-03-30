package com.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigExample
 */
public class ServletConfigExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private int i;
	ServletConfig servletconfig = null;
	public void init(ServletConfig config) throws ServletException
	{
		this.servletconfig = config;
		System.out.println("init method called");
		
		String drivername=servletconfig.getInitParameter("drivername");
		System.out.println(drivername);
		
		/*
		 * by enumeration we can get all parameters at once.
		 */
		Enumeration<String> enu=servletconfig.getInitParameterNames();
		while(enu.hasMoreElements()){
			String driver=enu.nextElement();
			String value1=servletconfig.getInitParameter(driver);
			String user=enu.nextElement();
			String value2=servletconfig.getInitParameter(user);
			String pass=enu.nextElement();
			String value3=servletconfig.getInitParameter(pass);
			System.out.println("driver :"+value1+" username :"+value2+" password : "+value3);
		}
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		++i;
		System.out.println(i);
		
		System.out.println("init method called");
		PrintWriter out = response.getWriter();
		
		
		servletconfig=getServletConfig();
		
		System.out.println("get servlet name : "+servletconfig.getServletName());
		System.out.println("get servlet object : "+servletconfig);
		System.out.println("ServletContext object : "+servletconfig.getServletContext());
		
		out.print("<html><body>");
		out.print("<h>hi this servlet config example</h> "+i+ " time ");
		out.print("</body></html>");
		
	
	}
	
	public ServletConfig getServletConfig() 
	{
		return servletconfig;
	}

	
	public void destroy() 
	{
		System.out.println("destroy method called");
	}

}
