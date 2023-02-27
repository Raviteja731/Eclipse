package com.xworkz.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringComponent {

	public SpringComponent() {
		System.out.println("Running SpringComponent");
	}

	@Autowired
	@Qualifier("names")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SpringComponent [name=" + name + "]";
	}

}
