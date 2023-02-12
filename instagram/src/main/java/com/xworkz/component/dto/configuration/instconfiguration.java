package com.xworkz.component.dto.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.component")
public class instconfiguration {

	public instconfiguration() {
	System.out.println("created instconfiguration...."+getClass().getSimpleName());
	}
}
