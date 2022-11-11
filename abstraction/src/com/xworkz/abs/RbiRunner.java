package com.xworkz.abs;

public class RbiRunner {

	public static void main(String[] args) {
		
		Rbi rb = new Hdfc();
		rb.rbiInterestRate("RbiBnagalore", 1);
		rb.getInterestRate();
		
		Hdfc hd = new Hdfc();
		hd.getLocation("mumbai");
		hd.getLocation();

	}

}
