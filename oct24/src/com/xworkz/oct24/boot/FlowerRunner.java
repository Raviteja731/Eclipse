package com.xworkz.oct24.boot;

import com.xworkz.oct24.Flower;

public class FlowerRunner {

	public static void main(String[] args) {

		Flower flower = new Flower(150);
		flower.shopName = "PushpaRaj Flowers";
		flower.flowerSmells = true;
		
		
		flower.display();	
	}

}
