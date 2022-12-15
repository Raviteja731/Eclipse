package com.xworkz.pizza.service.boot;

import java.time.LocalDateTime;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.dto.PizzaSize;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImple;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaService pizzaService = new PizzaServiceImple();
		PizzaDTO dto = new PizzaDTO();
		
		
		dto.setName("Buffalo Pizza");
		dto.setCheese(true);
		dto.setCompany("Dominos");
		dto.setCreaatedDate(LocalDateTime.now());
		dto.setCreatedBy("Anshul Gupta &  Amit Raj");
		dto.setPrice(399);
		dto.setSize(PizzaSize.MEEDIUM);
		dto.setType("Veg");
		dto.setFlavour("Pepperoni");
		
		pizzaService.findAndSave(dto);
		
		

	}

}
