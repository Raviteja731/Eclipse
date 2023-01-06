package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Road;

public class RoadRunner {

	public static void main(String[] args) {


		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Road ref =appContext.getBean(Road.class);
		System.out.println(ref);
	}

}
