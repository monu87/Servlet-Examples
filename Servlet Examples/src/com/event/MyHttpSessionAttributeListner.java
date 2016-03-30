package com.event;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListner implements HttpSessionAttributeListener {

   
    public void attributeAdded(HttpSessionBindingEvent hsbe)  { 
    	
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");
    	System.out.println("attribute added has been called"+this.getClass().getName());
    	
    	System.out.println("Newly added attribute name"+hsbe.getName()+" : "+hsbe.getValue());
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");
    	
    }

	public void attributeRemoved(HttpSessionBindingEvent hsbe)  {
		System.out.println("- - - - - - - - - - - - - - - - - - - ");
    	System.out.println("attribute removed has been called"+this.getClass().getName());
    	
    	System.out.println("Removed attribute name"+hsbe.getName()+" : "+hsbe.getValue());
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");

		
	}
    public void attributeReplaced(HttpSessionBindingEvent hsbe)  { 
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");
    	System.out.println("attribute replaced has been called"+this.getClass().getName());
    	
    	System.out.println("Removed attribute name"+hsbe.getName()+" : "+hsbe.getValue());
    	System.out.println("- - - - - - - - - - - - - - - - - - - ");

    	
    }
	
}
