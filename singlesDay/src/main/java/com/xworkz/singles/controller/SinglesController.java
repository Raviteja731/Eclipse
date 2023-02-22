package com.xworkz.singles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.singles.dto.SinglesDTO;
import com.xworkz.singles.service.SinglesService;

@Controller
@RequestMapping("/")
public class SinglesController {

	@Autowired
	private SinglesService singlesService;
	
	public SinglesController() {
	System.out.println("Created SinglesController..."+getClass().getSimpleName());	
	}
	
	@PostMapping("/send")
	public String singles(SinglesDTO dto) {
		System.out.println("Created singles...");
	boolean save = singlesService.validationAndSave(dto);
		System.out.println(save);
		return "Display";
	}
	
}
