package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Mask;

public class MaskRunner {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Mask ref =appContext.getBean(Mask.class);
		System.out.println(ref);
	}

}
