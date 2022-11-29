package com.xwork.rules.followers.boot;

import com.xwork.rules.CookingRules;
import com.xwork.rules.followers.Cooking;

public class CookingRulesRunner {

	public static void main(String[] args) {


		Object obj = new Cooking();
		
		Cooking cooking = new Cooking();
		
		CookingRules cook = new Cooking();
		
		System.out.println(cooking.chef());
		System.out.println(cooking.heat());
		System.out.println(cooking.items());
		System.out.println(cooking.TakingCare());
		System.out.println(cooking.taste());

	}

}
