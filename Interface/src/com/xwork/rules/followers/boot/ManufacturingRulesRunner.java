package com.xwork.rules.followers.boot;

import com.xwork.rules.ManufacturingRules;
import com.xwork.rules.followers.Manufacturing;

public class ManufacturingRulesRunner {

	public static void main(String[] args) {

		Object obj = new Manufacturing();
		
		ManufacturingRules manu = new Manufacturing();
		
		Manufacturing manuf = new Manufacturing();
		
		System.out.println(manu.company());
		System.out.println(manu.heat());
		System.out.println(manu.items());
		System.out.println(manu.temp());
		System.out.println(manu.unsafeToHumans());
	}

}
