package com.xworkz.dto.configuration.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.CarDto;

@Component
@RequestMapping("/send")
public class CarComponent {

	public CarComponent() {
		System.out.println("created CarComponent..."+getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCarModel(CarDto dto,Model model) {
		System.out.println("created onCarModel...");
		model.addAttribute("Name", dto.getName());
		model.addAttribute("model", dto.getModel());
		model.addAttribute("colour", dto.getColour());
		model.addAttribute("milage", dto.getMilage());
		model.addAttribute("price", dto.getPrice());
		
		System.out.println(dto);

		return"Display.jsp";
	}
	
	
}
