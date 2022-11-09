package com.xworkz.base.base2;

public class Ravi extends Criminal {

	public boolean jail;
	public boolean happy;
	
	public Ravi(String offence, int number, String name, int age, boolean jail, boolean happy) {
		super(offence, number, name, age);
		this.jail = jail;
		this.happy = happy;
	}
	public void show()
	{
		super.display();
		System.out.println(this.jail);
		System.out.println(this.happy);
	}
	
}
