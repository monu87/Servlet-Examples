package com.formdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void init(ServletConfig config) throws ServletException 
    {

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Enumeration<String> headers= request.getHeaderNames();
		
		while(headers.hasMoreElements()){
			String headername=headers.nextElement();
			String headervalue=request.getHeader(headername);
			System.out.println("headername-->"+headername+ " : "+"headervalue"+headervalue);
		}
		
		String name= request.getParameter("First Name");
		out.print("Read data using <b>getParameter(String name)</b> method");
			out.print("<ul><li>First Name  :  "+ name+"</li>");
			out.print("<li>Last Name :  "+request.getParameter("Last Name") +"</li></ul>");
		
		out.print("Read data using <b>Enumeration getParameterNames()</b> method");
		Enumeration<String> enu=request.getParameterNames();
		out.print("<ul>");
		while(enu.hasMoreElements()){
			String pname = enu.nextElement();
			String value = request.getParameter(pname);
			out.print("<li>"+pname+" :"+value+"</li>");
		}  
		out.print("</ul>");
		
		out.print("Read data using <b>Map getParameterMap()</b> method");
		Map<String, String[]> paramMap = request.getParameterMap();
		Set<String> paramnameSet= paramMap.keySet();
		
		out.print("<ul>");
		for (String mapname:paramnameSet)
		{
			String[] value= paramMap.get(mapname);
			for(int i=0;i<value.length;i++)
			{
				out.print("<li>"+mapname+": "+value[i]+"</li>");
			}			
		}
		out.print("</ul>");
		
	}
	
	public void destroy() 
	{
		System.out.println("End of form example");
	}


}
