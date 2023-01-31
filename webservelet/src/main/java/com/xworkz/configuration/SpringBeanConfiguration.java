package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.configuration.component")
public class SpringBeanConfiguration {

	public SpringBeanConfiguration() {
		System.out.println("created SpringBeanConfiguration"+getClass().getSimpleName());
}
}
