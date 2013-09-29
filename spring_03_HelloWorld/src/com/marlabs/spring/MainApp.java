package com.marlabs.spring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	static Logger log = Logger.getLogger(MainApp.class.getName());
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		log.info("Going to create HelloWorld Obj!");
		
		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
		obj.getMessage();
		context.registerShutdownHook();
		
		log.info("Exiting the program!");
	}
}
