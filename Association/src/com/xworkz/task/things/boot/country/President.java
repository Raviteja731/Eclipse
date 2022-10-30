package com.xworkz.task.things.boot.country;

import com.xworkz.task.things.Gender;

public class President {

	public String name;
	public int tenure = 5;
	public Gender gender = Gender.MALE;
	
	public President(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Showing President details");
	System.out.println("President Name :"+this.name);
	System.out.println("Tenure :"+this.tenure);
		
		if(gender!=null)
		{
		System.out.println("Gender :"+this.gender);
		}else {
			System.out.println("gender is pointing to null");
		}
	}
	
	
}
