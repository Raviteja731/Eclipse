package com.xwork.rules.followers.boot;

import com.xwork.rules.OperationRules;
import com.xwork.rules.followers.Operation;

public class OperationRulesRunner {

	public static void main(String[] args) {

		Object objec = new Operation();
		
		Operation ope = new Operation();
		
		OperationRules op = new Operation();
		
		System.out.println(ope.carefully());
		System.out.println(ope.cleans());
		System.out.println(ope.doctWellEducated());
		System.out.println(ope.experinceDoct());
		System.out.println(ope.precautions());
	}

}
