package com.readallparametes;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadAllParameters extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String title="All Parameter Values";
		out.println("<!Doctype html><html><body bgcolor=\"#f0f0f0\" align=\"center\"><h1 align=\"center\">"+title+"</h1>");
		out.println("<table border=\"1\" align=\"center\"><tr bgcolor=\"darkgrey\"><th>Param Name</th><th>Param Value</th>");
		Enumeration<String> paramNames= request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String paramName= paramNames.nextElement();
			out.println("<tr><td>"+paramName+"</td><td>");
			String[] paramValues=request.getParameterValues(paramName);
			
			if(paramValues.length==1)
			{
				String paramValue=paramValues[0];
				if(paramValue.length()==0){
					out.println("<i>No value</i>");
				}
				else{
					out.println(paramValue);
				}
			}
			else
			{
				out.println("<ul>");
				for(int i=0;i<paramValues.length;i++)
				{
					out.println("<li>"+paramValues[i]);
				}
				out.println("</ul>");
				
			}
			
		}
		
		out.println("</td></tr></table></body></html>");
	}

	
}
