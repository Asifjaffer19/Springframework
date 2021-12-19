package com.aasifjaffer.spring;



import javax.naming.Context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )   
    
    {
    	
		
		
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		 * student student1 = (student) context.getBean("student1"); student1.read();
		 */
		 
		
		/*
		 * ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		 * vehicle vehicle1 = (vehicle) con.getBean("bike"); vehicle1.drive();
		 */
		 
		 
		 
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); //BeanFactory context = new
		 * XmlBeanFactory(new FileSystemResource("spring.xml")) vehicle v =
		 * (vehicle)context.getBean("car"); v.drive();
		 * 
		 */
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        tyre t = (tyre) context.getBean("tyre1");
        System.out.println(t);
        
        
    }
}
