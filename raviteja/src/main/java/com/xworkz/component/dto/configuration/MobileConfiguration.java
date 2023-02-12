package com.xworkz.component.dto.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.component")
public class MobileConfiguration {

	public MobileConfiguration() {
		System.out.println("created MobileConfiguration.."+getClass().getSimpleName());
	}
	
	
}
