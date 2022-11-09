package com.xworkz.base.boot.boot2;


import com.xworkz.base.base2.Moon;
import com.xworkz.base.base2.Satelite;

public class MoonRunner {

	public static void main(String[] args) {

		Moon moon = new Moon(4, 50000, "White");
		
		Moon moon2 = new Satelite(5, 50000, "White", "Moon", true);
		
		Satelite satelite = new Satelite(5, 50000, "White", "Moon", true);
		
		moon.display();
		System.out.println("==============");
		satelite.display();
	}

}
