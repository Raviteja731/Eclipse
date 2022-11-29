package com.xwork.rules.followers.boot;

import com.xwork.rules.MarriageRules;
import com.xwork.rules.followers.Marriage;

public class MarriageRulesRunner {

	public static void main(String[] args) {

		Object object = new Marriage();
		
		Marriage marriage = new Marriage();
		
		MarriageRules marriageRules = new Marriage();
		
		System.out.println(marriage.bothMajor());
		System.out.println(marriage.brideGroom());
		System.out.println(marriage.dowary());
				System.out.println(marriage.happyBride());
				System.out.println(marriage.location());


	}

}
