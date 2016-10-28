package com.udemy.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
    public static void main(String[] args) {    	
    	/*
    	 * 1. ClassPathXmlApplicationContext if we use this then it is not required to specify complete qualified path
    	 * 2. ApplicationContext is super class, can take other context as well
    	 * 
    	 */
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/tutorial/beans/beans.xml");
        Person person= (Person)context.getBean("person");
        person.speak();
        
        System.out.println(person);
        
        /*
         * Here we are casting the context to ClassPathXmlApplicationContext to close it.
         */               
        ((ClassPathXmlApplicationContext)context).close();
    }
}
