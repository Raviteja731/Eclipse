package com.xworkz.acess;

public class Person {

	public String name;
	public Email[] email;
	public Job job;
	
	
	
	public Person(String name, Email[] email, Job job) {
		this.name = name;
		this.email = email;
		this.job = job;
	}



	public void showOff()
	{
		System.out.println("Person Name"+this.name);
		if(email!=null)
		{
		for (int i = 0; i < email.length; i++)
		{
			Email array = email[i];
			array.display();
			
		}
	}
		if(job!=null)
		{
			this.job.showOff();
		}
	}
	
}
