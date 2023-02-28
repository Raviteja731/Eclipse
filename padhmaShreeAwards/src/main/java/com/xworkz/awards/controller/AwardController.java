package com.xworkz.awards.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.awards.dto.AwardDTO;
import com.xworkz.awards.service.AwardService;

@Controller
@RequestMapping("/")
public class AwardController {
	
	
	
	@Autowired
	private AwardService awardService;

	public AwardController() {
		System.out.println("created AwardController..." + getClass().getSimpleName());
	}

	@GetMapping("/abc")
	public String awards() {
		System.out.println("rUNNING GET mapping");
		return "index";
	}

	@PostMapping("/abc")
	public String awards(AwardDTO dto, Model model) {

		System.out.println("Created awards....");
		Set<ConstraintViolation<AwardDTO>> violations = awardService.validateAndSave(dto);
		if (!violations.isEmpty()) {
			System.out.println("viloation is there ");
			model.addAttribute("dto", dto);
		} else {
			System.out.println("viloation is not there");
			model.addAttribute("error", violations);
		}
		model.addAttribute("AwardName", dto.getAwardName());
		model.addAttribute("firstReciverName", dto.getFirstReciverName());
		model.addAttribute("recivedDate", dto.getRecivedDate());
		model.addAttribute("GivenBy", dto.getGivenBy());
		model.addAttribute("Recived", dto.isRecived());
		model.addAttribute("Not_Recived", dto.isNot_Recived());
		System.out.println(dto);

		return "searchPage";
	}

	@GetMapping("se")
	public String search(@RequestParam int id,Model model) {
	AwardDTO awardDTO =	awardService.findby(id);
		if (awardDTO!=null) {
			System.out.println("==========================================");
			System.out.println(awardDTO);
			model.addAttribute("AwardDTO", awardDTO);
			return "searchPage";
		}
		else {
			System.err.println("id not found");
			return "searchPage";
		}
		
	}
	
	@GetMapping("/findByAwardName")
	public String findName(Model model,@RequestParam String AwardName) {
		
		System.out.println("Running findName...");
		List<AwardDTO> list = awardService.findAwardName(AwardName);
		
		if(list!= null&& !list.isEmpty()) {
			model.addAttribute("list", list);
			return "findByAwardName";
		}else {
			System.err.println("Dataa is not Found");
			return "findByAwardName";
		}
		
	}
}
