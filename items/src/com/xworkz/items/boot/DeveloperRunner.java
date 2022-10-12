package com.xworkz.items.boot;

import com.xworkz.items.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {

	Developer person = new Developer();
	System.out.println(person.name);
	System.out.println(person.education);
	System.out.println(person.experince);
	System.out.println(person.company);
	System.out.println(person.salary);
	
	System.out.println("------updated values------");
	person.name="Omkar";
	person.education="B.Tech";
	person.company="Production";
	person.experince=12;
	person.salary=150000L;
	System.out.println("Name :"+person.name);
	System.out.println("Education :"+person.education);
	System.out.println("Experince :"+person.experince);
	System.out.println("Company :"+person.company);
	System.out.println("Salary :"+person.salary);
	}

}
