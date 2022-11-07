package com.xworkz.base.boot;

import com.xworkz.base.Court;
import com.xworkz.base.DistrictCourt;
import com.xworkz.base.HighCourt;
import com.xworkz.base.SupremCourt;

public class CourtRunner { 

	public static void main(String[] args) {

		Court court = new Court();
		Court court2 = new HighCourt();
		Court court3 = new SupremCourt();
		Court court4 = new DistrictCourt();
		
		System.out.println(court.judgeName);
		System.out.println(court.location);
		System.out.println("end of court ");

		
		HighCourt highCourt = (HighCourt)court2;
		System.out.println(highCourt.judgeName);
		System.out.println(highCourt.location);
		System.out.println("end of highcourt ");
		
		SupremCourt supremCourt =(SupremCourt)court3;
		System.out.println(supremCourt.judgeName);
		System.out.println(supremCourt.location);
		System.out.println("end of SupremCourt ");

		
		DistrictCourt districtCourt = (DistrictCourt)court4;
		System.out.println(districtCourt.judgeName);
		System.out.println(districtCourt.location);
		System.out.println("end of DistrictCourt ");
	}

}
