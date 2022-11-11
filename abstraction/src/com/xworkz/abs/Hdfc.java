package com.xworkz.abs;

public class Hdfc extends Rbi{

	@Override
	void getInterestRate() {
	
		System.out.println("interest rate is : "+ 20);
		
	}
	
	void getLocation() {
		System.out.println("calling location from hdfc class");
	}
	
	public void getLocation(String location) {
		System.out.println("Location : "+ location);;
	}
	
	public void display() {
		super.display();
		this.getInterestRate();
	}

}
