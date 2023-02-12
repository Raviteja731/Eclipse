package com.xworkz.component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.component.dto.BeveragesDto;
import com.xworkz.component.dto.ChatsDto;
import com.xworkz.component.dto.FamilyDto;
import com.xworkz.component.dto.MobileDto;

@Component
@RequestMapping("/")
public class MobileComponent {

	@GetMapping("/BestFriends")
	public String friendss(Model model) {
		System.out.println("created  friendss...");
		
	List<String> list = Stream.of("Dharshan", "bakasuri", "manu", "Shubam", "hareesha", "akshay", "Karthik", "Nataraj").collect(Collectors.toList());
	model.addAttribute("friends", list);
	return "index.jsp"; 
	
	}
	
	@GetMapping("/email")
	public String email(Model model) {
		
		System.out.println("created email...");
		model.addAttribute("Email", "ravitejak1900@gmail.com");
		return "index.jsp";
	}
	
	@GetMapping("/mobile")
	public String mobileNo(Model model) {
		
		System.out.println("created mobileNo...");
		model.addAttribute("MobileNo", "7026167838");
		return "index.jsp";
	}
	
	@GetMapping("/adhar")
	public String adhar(Model model) {
		
		System.out.println("created mobileNo...");
		model.addAttribute("Adhar", "596454952278");
		return "index.jsp";
	}
	
	@GetMapping("/age")
	public String age(Model model) {
		
		System.out.println("created Age...");
		model.addAttribute("Age", "23");
		return "index.jsp";
	}
	
	@GetMapping("/desiredSal")
	public String salary(Model model) {
		
		System.out.println("created salary...");
		model.addAttribute("salaryy", "450000");
		return "index.jsp";
	}
	
	@GetMapping("/DOB")
	public String dob(Model model) {
		
		System.out.println("created salary...");
		model.addAttribute("dateOfBirth", LocalDateTime.now());
		return "index.jsp";
	}
	
	@GetMapping("/friends")
	public String String(Model model) {
		
		System.out.println("created salary...");
		model.addAttribute(null, model);
		return "index.jsp";
	}
	
	@GetMapping("/Places")
	public String visitedPlaces(Model model) {
		System.out.println("created  visitedPlaces...");
		
	List<String> list = Stream.of("Bellary", "Hyderbad", "Goa", "Dharwad", "Hubbli", "Karnool", "Hospet", "Banglore").collect(Collectors.toList());
	model.addAttribute("places", list);
	return "index.jsp"; 
	
	}
	
	@GetMapping("/skills")
	public String techanicalSkills(Model model) {
		System.out.println("created  techanicalSkills...");
		
	List<String> list = Stream.of("JDK", "JVM", "JRE", "Constructor", "Chaining", "Method",
			"This", "Super", "Inheritence", "Polymorphisam", "Overloading", "Overriding", "Encapsulation",
			"Abstraction", "Interface", "Abstract", "Collection", "ArrayList", "LinkedList", "Set", "Queqe",
			"HashSet", "Linked Hash Set").collect(Collectors.toList());
	model.addAttribute("skills", list);
	return "index.jsp"; 
	
	}
	
	@GetMapping("/mobilee")
	public String phone(Model model) {
		System.out.println("created  mobile...");
		MobileDto dto = new MobileDto("Nokia",25.0,2.6,"Black","India");
		
	model.addAttribute("mobile", dto);
	return "index.jsp"; 
	
	}

	@GetMapping("/beverages")
	public String beverages(Model model) {
		System.out.println("created  beverages...");
		BeveragesDto dto=new BeveragesDto("Pepsi", 12, 2, true, "Green", "Surya", 2001, 1945);
	model.addAttribute("juice", dto);
	return "index.jsp"; 
	
	}
	
	@GetMapping("/Chats")
	public String chatss(Model model) {
		System.out.println("created  chatss...");
		ChatsDto dto=new ChatsDto(null, 0, null, null, null, 0, null, null, 0, null, null);
	model.addAttribute("Chats", dto);
	return "index.jsp"; 
	
	}
	
	@GetMapping("/Surya")
	public String familyy(Model model) {
		System.out.println("created  familyy...");
		FamilyDto dto = new FamilyDto("err", "sdfghjgh", "esht", 0, 0, 0, 0, null, 0, 0);
		model.addAttribute("teja", dto);
	return "index.jsp"; 
	
	}
}
