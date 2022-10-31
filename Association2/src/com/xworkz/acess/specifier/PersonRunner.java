package com.xworkz.acess.specifier;

import com.xworkz.acess.Address;
import com.xworkz.acess.City;
import com.xworkz.acess.Company;
import com.xworkz.acess.Country;
import com.xworkz.acess.Email;
import com.xworkz.acess.Job;
import com.xworkz.acess.Location;
import com.xworkz.acess.Person;
import com.xworkz.acess.State;

public class PersonRunner {

	public static void main(String[] args) {

	
		
		Country country = new Country("India", "Dheli", "Modhi", "+91");
		
		State state = new State("Karnataka", "Banglore", 11, "Bommai");
		
		City city1 = new City("Bellary", "Bellary Fort", "Dhurgama Temple", "Voganni&Bajji", "Shivamani");
		
		Location location = new Location("Bellary Street", city1, state, country);
		
		Address addresss = new Address(42,location);
		
		Company company = new Company("Google", "Karthi", addresss);
		
		Job job = new Job(200, "Developer", 1, company);
		
		Email email = new Email("preethi@gmail.com", "Preethi@123", 8145767659L,company);
		
		Email email1 = new Email("sanjana@gmail.com", "Sanjana@123", 8145789659L,company);
		
		Email[] mail = {email,email1};
		
		Person person = new Person("Darshan", mail, job);
		
		person.showOff();
	}

}
