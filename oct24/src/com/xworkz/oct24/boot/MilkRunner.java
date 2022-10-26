package com.xworkz.oct24.boot;


import com.xworkz.oct24.Milk;

public class MilkRunner {

	public static void main(String[] args) {

		Milk milk = new Milk(30);          
		milk.calcium =180 ;
		milk.from = "Buffalo";
		
		
		milk.display();	
	
	}

}
