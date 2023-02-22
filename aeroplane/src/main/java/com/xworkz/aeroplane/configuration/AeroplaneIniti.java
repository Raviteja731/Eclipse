package com.xworkz.aeroplane.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AeroplaneIniti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
	public AeroplaneIniti() {
		System.out.println("Created AeroplaneIniti..."+getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses...");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses..");
		Class[] ref = {AeroplaneConfiguration.class};
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
