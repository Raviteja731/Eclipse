package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Circle;

public class CircleRunner {

	public static void main(String[] args) {

		ApplicationContext
		 applicationContext= new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Circle ref =applicationContext.getBean(Circle.class);
		System.out.println("Message  :"+ref);
		
	}

}
