package com.xworkz.oct24.boot;

import com.xworkz.oct24.Lamp;

public class LampRunner {

	public static void main(String[] args) {

		Lamp lamp = new Lamp(150);
		lamp.shopName = "Buddha Light & Lamps ";
		lamp.watts = 60;
		
		
		lamp.display();	
	
	}

}
