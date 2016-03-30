package com.hellofilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter implements Filter {

	FilterConfig filterconfig;
	
	@Override
	public void init(FilterConfig config) throws ServletException 
	{
		System.out.println("init method is called" + this.getClass().getName());
		this.filterconfig = config;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out= response.getWriter();
		
		String filtername= filterconfig.getFilterName();
		System.out.println("Filter name is :" +filtername);
		
		String isConstruction= filterconfig.getInitParameter("construction");
		if(isConstruction.equals("yes"))
		{
			out.print("This page is under construction");
		}
		else{
			chain.doFilter(request, response);
		}
		
		
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	

	

}
