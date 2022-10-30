package com.xworkz.task.things;

public enum Gender {

	MALE("Male"),FEMALE("Female"),TRANS("TransGender");
	
	public String name;
	private Gender(String name)
	{
		this.name=name;
	}
}
