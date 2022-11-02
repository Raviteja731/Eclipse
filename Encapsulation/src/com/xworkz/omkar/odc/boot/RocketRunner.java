package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Aeroplane;
import com.xworkz.omkar.Rocket;

public class RocketRunner {

	public static void main(String[] args) {

		Aeroplane aeroplane = new Aeroplane();
		
		Rocket rocket = new Rocket();
		
		aeroplane.getCompanyName();
		rocket.useAeroplane(aeroplane);
	}

}
