package com.xwork.rules;

public interface ManufacturingRules {

	String items();
	int temp();
	boolean heat();
	boolean unsafeToHumans();
	String company();
	
}
