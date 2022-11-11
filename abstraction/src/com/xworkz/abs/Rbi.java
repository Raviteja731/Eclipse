package com.xworkz.abs;

public abstract class Rbi {
	
	int id;
	String name;
	
	public Rbi() {
		 System.out.println("calling rbi");
	}
	public Rbi(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	abstract void getInterestRate();
	
	public int rbiInterestRate(String name, int id) {
		System.out.println("name :"+ name);
		System.out.println("id : " + id);
		return 20;
		
	}
	
	void display() {
		getInterestRate();
	    rbiInterestRate(name, id);
	}

}
