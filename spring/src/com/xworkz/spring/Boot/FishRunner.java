package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Fish;

public class FishRunner {

	public static void main(String[] args) {


		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Fish ref =appContext.getBean(Fish.class);
		System.out.println(ref);
	}

}
