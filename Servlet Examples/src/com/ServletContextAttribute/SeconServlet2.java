package com.ServletContextAttribute;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SeconServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		response.setContentType("text/html");
  		PrintWriter out = response.getWriter();

  		
  		ServletContext appl = getServletContext();
  		
  		String company=(String) appl.getAttribute("Company");
  		String location=(String) appl.getAttribute("Locations");
  		out.print("Company : "+company+"<br>");
  		out.print("Location : "+location);
  		
  		/*
		Enumeration<String> enu = appl.getAttributeNames();
		while (enu.hasMoreElements()) {
			String atbnames = (String) enu.nextElement();
			out.print(atbnames+" : ");
			Object values= appl.getAttribute(atbnames);
			out.print(values+"<br>");
		}*/
		out.close();
  	}
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		ServletContext appl = getServletContext();
		PrintWriter out = response.getWriter();
		
		Enumeration<String> enu = appl.getAttributeNames();
		while (enu.hasMoreElements()) {
			String atbnames = (String) enu.nextElement();
			Object values= appl.getAttribute(atbnames);
			out.print(values+"<br>");
		}
		out.close();
	}*/

}
