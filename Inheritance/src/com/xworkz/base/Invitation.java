package com.xworkz.base;

public class Invitation {

	public String  occasion;
	public int noOfCopies;
	public int totalPayment;
	
	public Invitation()
	{

	}

	public Invitation(String occasion, int noOfCopies, int totalPayment) {
		this.occasion = occasion;
		this.noOfCopies = noOfCopies;
		this.totalPayment = totalPayment;
	}
	
}
