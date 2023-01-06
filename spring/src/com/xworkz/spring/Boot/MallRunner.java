package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Mall;

public class MallRunner {

	public static void main(String[] args) {


		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Mall ref =appContext.getBean(Mall.class);
		System.out.println(ref);
	}

}
