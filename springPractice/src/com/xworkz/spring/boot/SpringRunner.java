package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.component.SpringComponent;
import com.xworkz.spring.configuration.SpringConfiguration;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		SpringComponent component = context.getBean(SpringComponent.class);
		System.out.println(component);

		
		String str = component.getName();
		System.out.println(str);

	}
}