package com.meteor.module;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service 
public class Task {

	@Async
	public void runner(){
		final int count =10000;
		String tex = "";
		
		System.out.println( "start : " + System.currentTimeMillis() );
		
		for(int n=0; n<count;n++){
			tex +="test";
		}
		
		System.out.println( "end : " + System.currentTimeMillis() );
		
		System.out.println( "tex : " + tex );
	}
	
}
