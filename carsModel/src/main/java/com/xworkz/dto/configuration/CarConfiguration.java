package com.xworkz.dto.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.dto.configuration.component")
public class CarConfiguration {

	public CarConfiguration() {
		System.out.println("created CarConfiguration..."+getClass().getName());
	}
}
