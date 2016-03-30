package com.ServletContextAttribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet1
 */
public class FirstServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter  out = response.getWriter();
		
		ServletContext setingAttb= getServletContext();
		setingAttb.setAttribute("Company", "Wipro");
		setingAttb.setAttribute("Locations", "Chennai");
		
		out.print("<a href=\"Servlet2\">Visit</a>");
		out.close();
		
	}

	
}
