package com.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String user = request.getParameter("username");
			out.print("Wlcome "+user);
			
			HttpSession session = request.getSession();
			session.setAttribute("username", user);
			
			ServletContext context = getServletContext();
			int totaluser = (Integer)context.getAttribute("totalusers");
			int currentuser = (Integer)context.getAttribute("currentusers");
			
			out.print("Total user :"+totaluser);
			out.print("<br>Current User :"+currentuser);
			out.print("<br><a href='Logout'>Logout</a>");
			out.close();
	
	}

	

}
