package com.xwork.rules.followers;

import com.xwork.rules.TempleRules;

public abstract  class Temple implements TempleRules{

	public String location;
	
	public Temple(String location) 
	{
		this.location=location;
	}
	public  boolean dressCode() {
		return false;
	}

	public  double timings() {
		return 9.00;
	}

	
}
