package com.xwork.rules.followers.boot;

import com.xwork.rules.DrivingRules;
import com.xwork.rules.followers.Driving;

public class DrivingRulesRunner {

	public static void main(String[] args) {

		Object obj = new Driving();
		
		Driving driv = new Driving();
		
		DrivingRules driRules = new Driving();
		
		System.out.println(driv.carryDocuments());
		System.out.println(driv.drivingPerfect());
		System.out.println(driv.drunkAndDrive());
		System.out.println(driv.followTraficRules());
		System.out.println(driv.vechicalGoodCondi());

				
	}

}
