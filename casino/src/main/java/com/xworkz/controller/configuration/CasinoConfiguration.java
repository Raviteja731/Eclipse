package com.xworkz.controller.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class CasinoConfiguration {

	public CasinoConfiguration() {
		System.out.println("Created CasinoConfiguration..." + getClass().getSimpleName());
	}

	@Bean
	public ViewResolver onViewResolver() {

		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/");
		view.setSuffix(".jsp");
		return view;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("register localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}
}
