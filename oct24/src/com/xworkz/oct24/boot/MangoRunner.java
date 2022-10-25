package com.xworkz.oct24.boot;

import com.xworkz.oct24.Mango;

public class MangoRunner {

	public static void main(String[] args) {

		Mango mango = new Mango(150);
		mango.weight =205;
		mango.season = "Summer";
		
		
		mango.display();	
	
	}

}
