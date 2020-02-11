package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ConstructorInjectionDemo 
{
    public static void main( String[] args )
    {
    	//ApplicationContext ac=new ClassPathXmlApplicationContext("spring-core.xml");
		
		System.out.println("Welcome to spring");
		ApplicationContext ac=new ClassPathXmlApplicationContext("springcore-constructorinjection.xml");
		Car c=ac.getBean(Car.class);
		System.out.println(c.getModel());
		System.out.println(c.getColor());
		System.out.println(c.getYear());

    }
}
