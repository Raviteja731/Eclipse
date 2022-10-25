package com.xworkz.oct24.boot;

import com.xworkz.oct24.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {

		Saloon saloon = new Saloon(150);
		saloon.address ="Rajajinagar";
		saloon.since = 2020;
		
		
		saloon.display();	
	
	}

}
