package com.xwork.rules.followers.boot;

import com.xwork.rules.HospitalRules;
import com.xwork.rules.followers.*;

public class DocterRunner {

	public static void main(String[] args) {

		System.out.println("Main method riunning ");
		Docter docter=new Docter();
		Management management=new Management(docter);
		management.checkHospital();
		HospitalRules ho = new Docter();
		
				
		
	}

}
