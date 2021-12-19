package com.aasifjaffer.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

@Primary
public class snapdragon implements mobileProcessor {

	public void process()
	{
		System.out.println("best processor in the world");
	}
}
