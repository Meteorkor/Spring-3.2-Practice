package com.meteor.controller;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class HomeMvcTest {

	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {

		mockMvc = MockMvcBuilders.standaloneSetup( new TestController() )
				.setViewResolvers(viewResolver())
				.build();
		
		
	}
	@After
	public void teardown() {

	}

	@Test
	public void testTrue() {

		//mockMvc = MockMvcBuilders.standaloneSetup( new HomeController() )
		
		try {
			mockMvc.perform( get("home").param("tex","tex_test") );
			//mockMvc.perform( get("/ni").param("tex","tex_test") );
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println( mockMvc );
		
		
		assertTrue(true);
		
	}
	public ViewResolver viewResolver(){
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setViewClass( JstlView.class );
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	
}