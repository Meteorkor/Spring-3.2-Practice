package com.meteor.controller;

import java.util.Locale;
import java.util.concurrent.Callable;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meteor.module.Task;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/ni", method = RequestMethod.GET)
	public @ResponseBody Callable<String> home(Locale locale, Model model, HttpServletResponse response) {
		logger.info("Welcome home! The client locale is {}.", locale);
		/*
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		*/
		
		System.out.println( response );
		
		
		//return "home";
		return new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				//Task task = new Task();
				
				for(int f=0; f<2;f++){
					Thread.sleep(2000);
					//task.runner();
					System.out.println( System.currentTimeMillis() );
				}
				
				return "home";
			}
		};
		
	}

	@RequestMapping(value = "/ni2", method = RequestMethod.GET)
	public String home21231(Locale locale, Model model, HttpServletResponse response) {
		Task task = new Task();
		task.runner();
		return "home";
		
	}
	////////////////
		
	
}
