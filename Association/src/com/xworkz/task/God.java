package com.xworkz.task;

public class God {

	//  name, gender, mainPower,weapon:custom  showOff()
	
	public String name;
	public String gender;
	public String mainPower;
	public Weapon weapon = new Weapon("Gada", "To do good", 21);
	
	public God(String name, String gender, String mainPower) {
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}
	public void showOff()
	{
		System.out.println("God Name :"+this.name);
		System.out.println("God Gender :"+this.gender);
		System.out.println("God MainPower :"+this.mainPower);
		this.weapon.showOff();
	}
}
