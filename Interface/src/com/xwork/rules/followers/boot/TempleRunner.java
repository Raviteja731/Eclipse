package com.xwork.rules.followers.boot;

import com.xwork.rules.TempleRules;
import com.xwork.rules.followers.God;
import com.xwork.rules.followers.Temple;

public class TempleRunner {

	public static void main(String[] args) {

		Object obj = new God("Banglore");
		
		TempleRules temples = new God("bellari");
		
		Temple temp = new God(null);
		
		God go = new God("Banglore");
		
		System.out.println(go.timings());
		System.out.println(go.dressCode());
		System.out.println(go.location);
		
	System.out.println(System.lineSeparator());
		
		System.out.println(temp.dressCode());
		System.out.println(temp.timings());
		
	System.out.println(System.lineSeparator());

		System.out.println(temples.dressCode());
		System.out.println(temples.timings());
		
	}

}
