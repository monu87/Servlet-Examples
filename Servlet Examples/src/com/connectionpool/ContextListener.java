package com.connectionpool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg0)  
	 {
		System.out.println("\n------------------------------");
		System.out.println("ContextIntialized Method has been called.....");
		ConnectionManager.configureBoneCpConnectionPool();
		System.out.println("----------------------------------------");
		
	 	}
	 
    public void contextDestroyed(ServletContextEvent arg0)  
    {
    	System.out.println("\n------------------------------");
		System.out.println("ContextIntialized Method has been called.....");
		ConnectionManager.shutdownBoneCpConnectionPool();
		System.out.println("----------------------------------------");
    	
    }
   
	
}
