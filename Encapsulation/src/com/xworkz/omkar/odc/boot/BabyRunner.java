package com.xworkz.omkar.odc.boot;

import com.xworkz.omkar.Baby;
import com.xworkz.omkar.Diapers;

public class BabyRunner {

	public static void main(String[] args) {

		Diapers diapers = new Diapers();
		
		Baby baby = new Baby();
		
		diapers.getBrandName();
		baby.useDiapers(diapers);
		
				
	}

}
