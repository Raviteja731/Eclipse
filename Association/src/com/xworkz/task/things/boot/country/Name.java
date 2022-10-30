package com.xworkz.task.things.boot.country;

public class Name {

	public String currentName;
	public String oldName;
	public String newName;
	
	public Name(String currentName, String oldName, String newName) {
		this.currentName = currentName;
		this.oldName = oldName;
		this.newName = newName;
	}
	
	public void showOff()
	{
		System.out.println("Old Name :"+this.currentName);
		System.out.println("New Name :"+this.newName);
		System.out.println("Present Name :"+this.oldName);
	}
	
}
