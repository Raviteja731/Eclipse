package com.xworkz.singles.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SinglesIniti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public SinglesIniti() {
		System.out.println("Created SinglesIniti..."+getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] ref = {SinglesConfiguration.class};
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running  getServletMappings..");
		String[] string = {"/"};
		return string;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Created configureDefaultServletHandling..");
		configurer.enable();
	}
}
