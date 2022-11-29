package com.xwork.rules.followers;

import com.xwork.rules.MarriageRules;

public class Marriage implements MarriageRules {

	@Override
	public boolean happyBride() {
		System.out.println("Running happybride method");
		return false;
	}

	@Override
	public boolean brideGroom() {
		System.out.println("Running bridegroom method");
		return true;
	}

	@Override
	public boolean dowary() {
		System.out.println("Running dowary method");
		return true;
	}

	@Override
	public String location() {
		System.out.println("Running location method");
		return null;
	}

	@Override
	public boolean bothMajor() {
		System.out.println("Running Major method");
		return true;
	}

	
}
