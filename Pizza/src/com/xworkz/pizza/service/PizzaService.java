package com.xworkz.pizza.service;

import com.xworkz.pizza.dto.PizzaDTO;

public interface PizzaService {

	default int total() 
	{
		return 0;
	}
	boolean findAndSave(PizzaDTO dto);
}
