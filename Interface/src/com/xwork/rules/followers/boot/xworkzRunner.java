package com.xwork.rules.followers.boot;

import com.xwork.rules.DevelopmentInstitute;
import com.xwork.rules.Institute;
import com.xwork.rules.TestingInstitute;
import com.xwork.rules.XworkRajajiNagar;
import com.xwork.rules.followers.Xworkz;

public class xworkzRunner {

	public static void main(String[] args) {
	
	Object obj = new Xworkz();
	
	Institute inst = new Xworkz();
	
	DevelopmentInstitute deve = new Xworkz();
	
	TestingInstitute test = new Xworkz();
	
	XworkRajajiNagar xwork = new Xworkz();
	
	Xworkz work = new Xworkz();
	
	obj.getClass(); // 9 methods
	
	inst.interview();
	inst.placement(); // 11 methods
	
	deve.interview();
	deve.Receptionist(); // 12 methods
	
	test.goodTeaching();
	test.interview();
	test.noOfStaff();
	test.placement(); // 13 methods
	
	xwork.goodTeaching();
	xwork.interview();
	xwork.location();
	xwork.noOfStaff();
	xwork.placement();
	xwork.Receptionist();  // 15 methods
	
	work.goodTeaching();
	work.interview();
	work.location();
	work.noOfStaff();
	work.placement();
	work.Receptionist();    // 15 methods
	
	
	}
	
	
}
