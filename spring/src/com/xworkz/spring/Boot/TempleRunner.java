package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Temple;

public class TempleRunner {

	public static void main(String[] args) {


		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Temple ref =appContext.getBean(Temple.class);
		System.out.println(ref);
	}

}
