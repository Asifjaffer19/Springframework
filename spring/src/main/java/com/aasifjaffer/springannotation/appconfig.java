package com.aasifjaffer.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.aasifjaffer.springannotation")
public class appconfig {
	
	
	/*
	 * @Bean public samsung getphone() { return new samsung(); }
	 * 
	 * @Bean public mobileProcessor getprProcessor() { return new snapdragon(); }
	 */
}
