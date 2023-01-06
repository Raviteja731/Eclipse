package com.xworkz.spring.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfiguaration;
import com.xworkz.spring.things.Patient;

public class PatientRunner {

	public static void main(String[] args) {


		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Patient ref =appContext.getBean(Patient.class);
		System.out.println(ref);
	}

}
