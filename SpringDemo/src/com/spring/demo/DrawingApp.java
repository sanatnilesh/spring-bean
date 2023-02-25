package com.spring.demo;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	// Bean Scope
	// 1. Singleton - Only once per spring container
	// 2. Prototype - New Bean Created with Every request or reference
	// Web aware Context Bean Scopes
	// Request Scope - New bean per servlet request
	// Session Scope - New bean per session
	// Global Session - New bean per global HTTP session (portlet context)
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) applicationContext.getBean("circle");
		shape.draw();
		System.out.println(applicationContext.getMessage("greeting", null, "Default Greeting!", null));
		// Triangle triangle = (Triangle) applicationContext.getBean("triangle1");
		// triangle.draw();
	}

}
