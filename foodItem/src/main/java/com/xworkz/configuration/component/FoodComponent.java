package com.xworkz.configuration.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FoodComponent {

	public FoodComponent() {
		System.out.println("created FoodComponent..");
	}
	
	@PostMapping
	public String getshare(@RequestParam String name, @RequestParam String type, @RequestParam double price, @RequestParam int range) {
		
	System.out.println("created getShare...");
	System.out.println(name);
	System.out.println(type);
	System.out.println(range);
	System.out.println(price);
	return "Display.jsp";
	}
}
