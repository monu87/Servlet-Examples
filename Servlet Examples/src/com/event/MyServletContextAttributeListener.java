package com.event;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextAttributeListener
 *
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

   
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");
    	System.out.println("attribute added has been called"+this.getClass().getName());
    	
    	System.out.println("Newly added attribute name"+scae.getName()+" : "+scae.getValue());
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");
    }

    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");
    	System.out.println("attribute Replaced has been called"+this.getClass().getName());
    	
    	System.out.println("Newly Replaced attribute name"+scae.getName()+" : "+scae.getValue());
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");
    }
	
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");
    	System.out.println("attribute Removed has been called"+this.getClass().getName());
    	
    	System.out.println("Newly Removed attribute name"+scae.getName()+" : "+scae.getValue());
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");    }

	
    
	
}
