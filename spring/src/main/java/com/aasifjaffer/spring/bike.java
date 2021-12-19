package com.aasifjaffer.spring;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle {

	public void drive()
	{
		System.out.println("bike is running ");
	}
}
