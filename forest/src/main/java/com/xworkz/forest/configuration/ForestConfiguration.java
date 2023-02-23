package com.xworkz.forest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.forest")
public class ForestConfiguration {

	public ForestConfiguration() {
		System.out.println("Created ForestConfiguration"+getClass().getSimpleName());
	}
}
