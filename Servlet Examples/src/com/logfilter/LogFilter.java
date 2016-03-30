package com.logfilter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilter
 */
public class LogFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		PrintWriter out= response.getWriter();
		
		HttpServletRequest req= (HttpServletRequest) request;
		
		String ipaddress=req.getRemoteAddr();
		
		System.out.println("ip : "+ipaddress+" current time is : "+new Date().toString());
		out.print("Log filter is invoked before <br>");
				chain.doFilter(request, response);				
		out.print("Log filter is invoked after<br>");
		
	}	
	  
		public void destroy() 
		{

		}

}
