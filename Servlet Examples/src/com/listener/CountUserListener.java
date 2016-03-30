package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class CountUserListener implements HttpSessionListener {

	
	ServletContext context = null;
	
	static int totalUserCount=0, currentUserCount=0  ; 
	
	
    public void sessionCreated(HttpSessionEvent hse)  { 
    	System.out.println("session created method called"+this.getClass().getName());
    	
    	totalUserCount++;
    	currentUserCount++;
    	
    	context = hse.getSession().getServletContext();
    	context.setAttribute("totalusers", totalUserCount);
    	context.setAttribute("currentusers", currentUserCount);
    	
    	
    }

	
    public void sessionDestroyed(HttpSessionEvent hse)  { 
    	
    	System.out.println("session destroyed method called"+this.getClass().getName());
    	
    	currentUserCount--;    	
    	context.setAttribute("current users", currentUserCount);
    }
	
}
