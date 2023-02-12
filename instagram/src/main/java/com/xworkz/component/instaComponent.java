package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.component.dto.InstaDto;

@Component
@RequestMapping("/send")
public class instaComponent {

	public instaComponent() {
		System.out.println("Created instaComponent..."+getClass().getSimpleName());
	}
	@PostMapping
	public String instagram(InstaDto dto, Model model) {
		System.out.println("created instagram...");
		model.addAttribute("Name", dto.getName());
		model.addAttribute("Password", dto.getPassword());
		
		System.out.println(dto);
		return "sucesspage.jsp";
		
	}
}
