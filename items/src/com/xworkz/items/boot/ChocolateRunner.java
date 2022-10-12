package com.xworkz.items.boot;

import com.xworkz.items.Chocolate;
public class ChocolateRunner {

	public static void main(String[] args) {

		Chocolate snacks= new Chocolate();
		System.out.println(snacks.name);
		System.out.println(snacks.brand);
		System.out.println(snacks.price);
		System.out.println(snacks.flavour);
		
		System.out.println("------updated details------");
		snacks.name = "5Star";
		snacks.brand = "Cadbury's";
		snacks.price = 15;
		snacks.flavour = "Nuts";
		System.out.println("Chocolate Name :"+snacks.name);
		System.out.println("Chocolate Brand :"+snacks.brand);
		System.out.println("Chocolate Price :"+snacks.price);
		System.out.println("flavour :"+snacks.flavour);
	}

}
