package com.aasifjaffer.spring;

import org.springframework.stereotype.Component;
@Component
public class car implements vehicle {
	
	
	public void drive()
	{
		System.out.println("car is running ");
	}

}
