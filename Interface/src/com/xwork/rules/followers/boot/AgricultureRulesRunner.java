package com.xwork.rules.followers.boot;

import com.xwork.rules.AgricultureRules;
import com.xwork.rules.followers.Agriculture;

public class AgricultureRulesRunner {

	public static void main(String[] args) {

		Object obj = new Agriculture();
		
		AgricultureRules agri = new Agriculture();
		
		Agriculture agriculture = new Agriculture();
		
		System.out.println(agri.landArea());
		System.out.println(agri.organic());
		System.out.println(agri.soilColour());
		System.out.println(agri.wayOfLife());
	}

}
