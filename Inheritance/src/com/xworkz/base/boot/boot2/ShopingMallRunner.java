package com.xworkz.base.boot.boot2;

import com.xworkz.base.base2.Orion;
import com.xworkz.base.base2.ShoppingMall;

public class ShopingMallRunner {

	public static void main(String[] args) {

		Orion orion = new Orion("Banglore", 100);
		
		Orion orion2 =new ShoppingMall("Banglore", 100, "Darshan", 10);
		
		orion2.display();
		
	}

}
