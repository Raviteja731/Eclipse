package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.configuration.component")
public class FoodConfiguration {

	public FoodConfiguration() {
		
		System.out.println("created FoodConfiguration..."+getClass().getSimpleName());
	}
}
