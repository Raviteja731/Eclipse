package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.controller.dto.CasinoDTO;
import com.xworkz.controller.service.CasinoService;

@Controller
@RequestMapping("/")
public class CasinoController {

	@Autowired
	private CasinoService casinoService;
	
	public CasinoController() {
		System.out.println("Created CasinoController..."+getClass().getSimpleName());
	}
	@PostMapping("/Send")
	public String casino(CasinoDTO dto) {
		System.out.println("Running casino...");
		boolean save = casinoService.validationAndSave(dto);
		System.out.println(save);
		return "Display";
	}
}
