package com.xworkz.pizza.service;

import com.sun.org.apache.xerces.internal.impl.dv.DatatypeException;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.dto.PizzaSize;
import com.xworkz.pizza.exception.PizzaException;

public class PizzaServiceImple implements PizzaService {

	
		private int total =0;
	
	@Override
	public int total() {
		System.out.println("Running Total method ");
		return PizzaService.super.total();
		
	}

	@Override
	public boolean findAndSave(PizzaDTO dto) {
		System.out.println("Running findAndSave method");
		String company = dto.getCompany();
		String flavour = dto.getFlavour();
		String name = dto.getName();
		double price = dto.getPrice();
		PizzaSize size = dto.getSize();
		String type = dto.getType();
		
		boolean cheese = dto.isCheese();
		double price1 = dto.getPrice();
		boolean validName = false;
		boolean validCompany = false;
		boolean validFlavour = false;
		boolean validType = false;
		boolean validSize = false;
		boolean validPrice = false;
		
		if(name!=null && name.length()>=4 && name.length()<=20) {
			System.out.println("Valid Pizza Name :"+name);
			validName = true;
		}else {
			System.out.println("InValid Pizza Name");
			validName = false;
		}
		if(company!=null && company.length()>=4 && company.length()<=20) {
			System.out.println("Valid CompanyName :"+company);
			validCompany = true;
		}else {
			System.out.println("Invalid CompanyaName");
			validCompany = false;
		}
		if(size!=null) {
			System.out.println("Valid Size :"+size);
			validSize = true;
		}
		else {
			System.out.println("InValid Size");
			validSize = false;
		}
		if(flavour!=null && flavour.length()>=3 && flavour.length()<=20) {
			System.out.println("Valid Flavour :"+flavour);
			validFlavour = true;
		}else {
			System.out.println("Invalid Flavour");
			validFlavour = false;
		}
		if(type!=null && type=="Veg" || type =="Non-Veg") {
			System.out.println("Pizza Type Valid :"+type);
			validType = true;
		}else {
			System.out.println("InValid Type");
			validType = false;
		}
		if(price>=50 && price<=1200) {
			System.out.println("Valid Price :"+price);
			validPrice = true;
		}else {
			System.out.println("Invalid Price");
			validPrice = false;
		}
		if(validCompany && validFlavour && validName && validPrice && validSize && validType) {
			System.out.println("Pizza Data is Valid");
			return true;
		}
		return false;

	}

	
}
