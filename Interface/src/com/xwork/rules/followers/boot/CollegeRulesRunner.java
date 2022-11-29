package com.xwork.rules.followers.boot;

import com.xwork.rules.CollegeRules;
import com.xwork.rules.followers.College;

public class CollegeRulesRunner {

	public static void main(String[] args) {


            //CollageRules collageRules = new Coll;
		CollegeRules collegerule = new College(null, 0);
		
		College collage = new College(null, 0);
		
		Object object = new College(null, 0);
		
		//System.out.println(collage.dailyAttendence()); 
		System.out.println("DailyAttendence  : "+collage.dailyAttendence());
		System.out.println("Uniform  : "+collage.uniform());
		System.out.println("idtages  : "+collage.idtags());
		System.out.println("SchoolName : "+collage.schoolName());
		System.out.println("NoOfStaff : "+collage.noOfStaff());

		System.out.println("city : "+collage.city);
		System.out.println(collage.pincode);
		

			
			
	}

}
