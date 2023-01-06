package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Area;

public class AreaRunner {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Area ref =appContext.getBean(Area.class);
		System.out.println(ref);
	}

}
