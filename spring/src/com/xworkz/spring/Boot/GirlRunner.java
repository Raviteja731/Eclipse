package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Girl;

public class GirlRunner {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Girl ref =appContext.getBean(Girl.class);
		System.out.println(ref);
	}

}
