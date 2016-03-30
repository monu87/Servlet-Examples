package com.event;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {
	private static final long serialVersionUID = 1L;

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("---------------------------");
		System.out.println("attribute add method called"+this.getClass().getName());
		System.out.println("added attribute name :- "+srae.getName()+" value :-"+srae.getValue());
		System.out.println("---------------------------");
	}

	
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// System.out.println("---------------------------");
		System.out.println("attribute Replace method called"+this.getClass().getName());
		System.out.println("Replaced attribute name :- "+srae.getName()+" value :-"+srae.getValue());
		System.out.println("---------------------------");
		
	}
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("---------------------------");
		System.out.println("Attribute removed method called"+this.getClass().getName());
		System.out.println("Removed attribute name :- "+srae.getName()+" value :-"+srae.getValue());
		System.out.println("---------------------------");
		
	}

		

}

