package com.xworkz.oct13.boot;

import com.xworkz.oct13.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish = new Fish("Meglodon",280000000L);
			System.out.println(fish.name);
			System.out.println(fish.type);
			System.out.println(fish.price);
			System.out.println(fish.weight);
			System.out.println(fish.length);
			System.out.println("------updated details------");
		
		Fish fish1 = new Fish(18,"Otodontidae");
			System.out.println(fish1.name);
			System.out.println(fish1.type);
			System.out.println(fish1.price);
			System.out.println(fish1.weight);
			System.out.println(fish1.length);
			System.out.println("------updared details------");
			
		Fish fish2 = new Fish("50 tons");
				System.out.println(fish2.name);
			System.out.println(fish2.type);
			System.out.println(fish2.price);
			System.out.println(fish2.weight);
			System.out.println(fish2.length);
	
		Fish fish3 = new Fish(10000000L);
		System.out.println(fish3.name);
		System.out.println(fish3.type);
		System.out.println(fish3.price);
		System.out.println(fish3.weight);
		System.out.println(fish3.length);
		System.out.println("------updared details------");
			
	    Fish fish4 = new Fish(18);
	System.out.println(fish4.name);
	System.out.println(fish4.type);
	System.out.println(fish4.price);
	System.out.println(fish4.weight);
	System.out.println(fish4.length);
	System.out.println("------updared details------");

	
	     Fish fish5 = new Fish("50 tons","Meglodon");
	System.out.println(fish5.name);
	System.out.println(fish5.type);
	System.out.println(fish5.price);
	System.out.println(fish5.weight);
	System.out.println(fish5.length);
	System.out.println("------updared details------");

	
	Fish fish6 = new Fish("Meglodon","50 tons",10000000L,15,"Otodontidae");
		System.out.println(fish6.name);
		System.out.println(fish6.type);
		System.out.println(fish6.price);
		System.out.println(fish6.weight);
		System.out.println(fish6.length);
		System.out.println("------updared details------");

  }
}