package com.meteor.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * Handles requests for the application home page.
 */
@ControllerAdvice
public class AdviceController {
	
	 //@ExceptionHandler(Exception.class)
	    public String exception(Exception e) {
	 
		 System.out.println("test error");
	        return "home";
	    }
	
	    @InitBinder
	    public String initbinder(){
	    	System.out.println("test init");
	    	return "home";
	    }
	    
}
