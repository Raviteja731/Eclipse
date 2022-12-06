package com.xwork.rules.followers;

import com.xwork.rules.KarnatakaRTO;

public class VijayaLakshmi extends JavaTrienee implements KarnatakaRTO {

	public VijayaLakshmi(String name, int age, String gender, String nativee, String qualifaction) {
		super(name, age, gender, nativee, qualifaction);
	}

	@Override
	public boolean paidTax() {
		System.out.println("Running paidTax Method");		
		return false;
	}

	@Override
	public double gst() {
		System.out.println("Running gst Method");		
		return 0;
	}

	@Override
	public double vat() {
		// TODO Auto-generated method stub
		return 0;
	}

}
