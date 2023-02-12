package com.xworkz.controller.dto.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.controller")
public class BakeryConfiguration {

	public BakeryConfiguration() {
		System.out.println("Created BakeryConfiguration..."+getClass().getSimpleName());
	}
	
	@Bean
		public ViewResolver onViewResolver() {
			InternalResourceViewResolver resolver = new InternalResourceViewResolver();
			resolver.setPrefix("/");
			resolver.setSuffix(".jsp");
			return resolver;
			
		}
	
}
