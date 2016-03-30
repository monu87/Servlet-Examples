package com.event;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HttpSessionAttributeListnerTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		sleep();
		HttpSession httpsession= request.getSession();
		
		httpsession.setAttribute("Comapny", "Infosys");
		
		sleep();
		
		httpsession.setAttribute("Comapny", "IBM");
		
		sleep();
		
		httpsession.removeAttribute("Company");
		
		
		
	}

	private void sleep() {

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
