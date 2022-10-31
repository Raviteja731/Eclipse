package com.xworkz.acess;

public class Job {

	public int salary;
	public String role;
	public int bonding;
	public Company company;
	
	
	public Job(int salary, String role, int bonding, Company company) {
		this.salary = salary;
		this.role = role;
		this.bonding = bonding;
		this.company = company;
	}
	
	public void showOff()
	{
		System.out.println("=====Showing Job Details=====");
		System.out.println("Company Bonding :"+this.bonding);
		System.out.println("Job Role :"+this.role);
		System.out.println("Salary :"+this.salary);
		this.company.showOff();
	
	}
}
