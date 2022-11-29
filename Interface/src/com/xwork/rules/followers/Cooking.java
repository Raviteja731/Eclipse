package com.xwork.rules.followers;

import com.xwork.rules.CookingRules;

public class Cooking implements CookingRules {

	@Override
	public boolean taste() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean TakingCare() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String items() {
		// TODO Auto-generated method stub
		return "water,oil,etc";
	}

	@Override
	public int heat() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String chef() {
		// TODO Auto-generated method stub
		return "vikas";
	}

}
