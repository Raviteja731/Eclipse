package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.component.SpringComponent;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Running SpringConfiguration");
	}

	@Bean()
	public String names() {
		System.out.println("registring spring with name");

		return "Raviteja";
	}
	@Bean String type()
	{
		return"sdgd";
	}

}
