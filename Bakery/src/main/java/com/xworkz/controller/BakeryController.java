package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.controller.dto.BakeryDto;
import com.xworkz.controller.dto.service.BakeryService;

@Controller
@RequestMapping("/")
public class BakeryController {
	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("Created BakeryContriller...."+getClass().getSimpleName());
	}
	
	@PostMapping("/Send")
	public String bakery(BakeryDto dto,Model model) {
		System.out.println("Running bakery.");
		model.addAttribute("Bakery", dto);
		boolean save = bakeryService.validationAndSave(dto);
		System.out.println(save);
		return "Display";
	}
}
