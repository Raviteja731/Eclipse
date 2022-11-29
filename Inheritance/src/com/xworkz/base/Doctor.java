package com.xworkz.base;

public class Doctor {

	public String city = "Bellary";
	public String specialist;
	Doctor doc;

	public void docter(Dentist dentist) {
		System.out.println(dentist.age);
		System.out.println(dentist.city);
		System.out.println(dentist.location);
		System.out.println(dentist.price);
		System.out.println(dentist.specialist);

	}

	public Object show() {

		return "dgf";
	}

}
