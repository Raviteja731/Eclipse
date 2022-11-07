package com.xworkz.base.boot;

import com.xworkz.base.Cardilologist;
import com.xworkz.base.Dentist;
import com.xworkz.base.Doctor;
import com.xworkz.base.ENT;

public class DoctorRunner {

	public static void main(String[] args) {

		Doctor doctor = new Doctor();
		Doctor doctor2 = new Dentist();
		Doctor doctor3 = new ENT();
		Doctor doctor4 = new Cardilologist();
		
		System.out.println(doctor.city);
		System.out.println(doctor.specialist);
		System.out.println("end of docter ");
		
		Dentist dentist = (Dentist)doctor2;
		System.out.println(dentist.age);
		System.out.println(dentist.location);
		System.out.println(dentist.price);
		System.out.println(dentist.specialist);
		System.out.println(dentist.city);
		System.out.println("end of the dentist ");
		
		
		ENT ent = (ENT)doctor3;
		//System.out.println(ent.age);
		System.out.println(ent.city);
		System.out.println(ent.fullForm);
		System.out.println(ent.gender);
		//System.out.println(ent.location);
		//System.out.println(ent.price);
		System.out.println(ent.specialist);
		System.out.println("end of the ENT ");
		
	
		Cardilologist cardilologist = (Cardilologist)doctor4;
	//	System.out.println(cardilologist.age);
		System.out.println(cardilologist.city);
	//	System.out.println(cardilologist.fullForm);
		//System.out.println(cardilologist.gender);
	//	System.out.println(cardilologist.location);
		System.out.println(cardilologist.name);
		System.out.println(cardilologist.noOfVisitorsPerDay);
		System.out.println(cardilologist.specialist);
	//	System.out.println(cardilologist.price);
		System.out.println("end of cardiologist");

		






	}

}
