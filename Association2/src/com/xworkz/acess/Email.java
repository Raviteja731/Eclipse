package com.xworkz.acess;

public class Email {

	public String id;
	public String password;
	public long mobilno;
public Company company;
	
	
	public Email(String id, String password, long mobilno,Company company) {
		this.id = id;
		this.password = password;
		this.mobilno = mobilno;
		this.company = company;
	}


	public void display()
	{
		System.out.println("====Showing Email Details====");
		System.out.println("Email Id :"+this.id);
		System.out.println("Password :"+this.password);
		System.out.println("Mobial No :"+this.mobilno);
		
		if(company!=null)
		{
			this.company.showOff();	
		}
	}
}
