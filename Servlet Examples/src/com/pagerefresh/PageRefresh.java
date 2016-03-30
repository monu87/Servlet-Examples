package com.pagerefresh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageRefresh
 */
public class PageRefresh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setIntHeader("Refresh",5);
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get( Calendar.SECOND);
		
		if(calendar.get(Calendar.AM_PM)==0){
			am_pm="AM";
		}
		else{
			am_pm="PM";
		}
		
		String CT =hour+ ":"+ minute +":"+ second;
		
		out.print("<h2 align=\"center\">Auto Refreshing after 5 seconds</h2>");
		out.print("<h3 align=\"center\">Current Time is : "+CT+"</h3>");
		
				
		
		
	}

	

}
