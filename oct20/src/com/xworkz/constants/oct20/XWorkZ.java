package com.xworkz.constants.oct20;

//import  com.xworkz.oct14.*;
public class XWorkZ {

	public String name;  
	public String[] staff;
	public int floors;
	public String ceo;
	public double height;
	public double widht;
	public byte noOfRooms;
	public byte studentsCapacity;
	


	
	public XWorkZ(String name,String[] staff,int floors,double width,
			byte noOfRooms,String ceo,double height,byte studentsCapacity)
	{
		this.name=name;
		this.staff=staff;
		this.floors=floors;
		this.widht=width;
		this.noOfRooms=noOfRooms;
		this.ceo=ceo;
		this.height=height;
		this.studentsCapacity=studentsCapacity;
	}

	public void displayDetails()
	{
		System.out.println("Institute Name :"+this.name);
		System.out.println("CEO Name :"+this.ceo);
		System.out.println("Institute Height :"+this.height);
		System.out.println("Institute Width :"+this.widht);
		System.out.println("No Of Rooms :"+this.noOfRooms);
		System.out.println("No of seats in Room :"+this.studentsCapacity);
		  for (int i = 0; i < staff.length; i++) {
			String ref = staff[i];
		
			System.out.println("Staff Names :"+this.staff);
			System.out.println(ref);
		}
	}
}
