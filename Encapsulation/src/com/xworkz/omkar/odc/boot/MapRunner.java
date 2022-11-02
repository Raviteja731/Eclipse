package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Country;
import com.xworkz.omkar.Map;

public class MapRunner {

	public static void main(String[] args) {

		Country country = new Country();
		Map map = new Map();
		country.getName();
		map.useCountry(country);
		
	}

}
