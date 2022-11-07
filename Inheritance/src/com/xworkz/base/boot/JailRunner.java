package com.xworkz.base.boot;

import com.xworkz.base.*;

public class JailRunner {

	public static void main(String[] args) {

		Jail jail = new Jail();
		Jail jail2 = new StateJail();
		Jail jail3 = new DistrictJail();
		Jail jail4 = new CityJail();
		
	System.out.println(jail.jailerName);
	System.out.println(jail.noOfPresinors);
	System.out.println("ends jail ");
	
	StateJail stateJail = (StateJail)jail2;
	System.out.println(stateJail.cmName);
	System.out.println(stateJail.jailerName);
	System.out.println(stateJail.noOfPresinors);
	System.out.println(stateJail.noOfStaff);
	System.out.println("ends of stateJail ");
	
	DistrictJail districtJail = (DistrictJail)jail3;
	System.out.println(districtJail.dcName);
	System.out.println(districtJail.jailerName);
	System.out.println(districtJail.noOfPresinors);
	System.out.println(districtJail.wifeName);
	System.out.println("ends District jail");
	
	CityJail cityJail = (CityJail)jail4;
	System.out.println(cityJail.jailerName);
	System.out.println(cityJail.mlaName);
	System.out.println(cityJail.noOfPresinors);
	System.out.println(cityJail.gender);
		
	System.out.println("ends city jail");
	
		
		
	}

}
