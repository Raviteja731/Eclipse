package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Milk;

public class MilkRunner {

	public static void main(String[] args) {


		ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Milk ref = app.getBean(Milk.class);
		System.out.println(ref);
	}

}
