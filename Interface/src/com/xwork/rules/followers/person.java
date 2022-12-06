package com.xwork.rules.followers;

public class person extends Object {

	public String name;
	public int age;
	public String gender;
	public String nativee;
	public String qualifaction;
	
	
	
	public person(String name, int age, String gender, String nativee, String qualifaction) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nativee = nativee;
		this.qualifaction = qualifaction;
	}
	
	public boolean eat() 
	{
		return false;
	}
	public boolean sleep() 
	{
		return true;
	}
	
}
