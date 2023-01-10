package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ram")
public class Actor {

	private String name;
	private String lang;
	private int age;
	
	public Actor(@Value("Raviteja") String name, @Value("Telugu") String lang, @Value("54") int age) {
		super();
		this.name = name;
		this.lang = lang;
		this.age = age;
	}
	
	public String getName() {
		System.out.println("Register Name with spring...");
		return name;
	}
	
	public String getLang() {
		System.out.println("Register Lang with spring...");
		return lang;
	}
	
	public int getAge() {
		System.out.println("Register age with spring...");
		return age;
	}
	
	
}
