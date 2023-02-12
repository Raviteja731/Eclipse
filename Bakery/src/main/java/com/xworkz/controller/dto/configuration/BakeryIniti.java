package com.xworkz.controller.dto.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BakeryIniti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public BakeryIniti() {
		System.out.println("Created BakeryIniti..."+getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses...");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses..");
		Class[] ref = {BakeryConfiguration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created getServletMappings..");
		String[] string = {"/"};
		return string;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Created configureDefaultServletHandling..");
		configurer.enable();
	}

}
