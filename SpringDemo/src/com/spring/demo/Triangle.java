package com.spring.demo;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, InitializingBean, ApplicationContextAware {

	private ApplicationContext applicationContext = null;
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		System.out.println("Inside drawing Triangle.....");
		for (Point point : points) {
			System.out.println("Point: X " + point.getX() + " Point: Y " + point.getY());
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.applicationContext = context;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Indise Initilization Bean method....");
	}

}
