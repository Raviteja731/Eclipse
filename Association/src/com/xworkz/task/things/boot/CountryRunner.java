package com.xworkz.task.things.boot;

import com.xworkz.task.things.boot.country.City;
import com.xworkz.task.things.boot.country.Country;
import com.xworkz.task.things.boot.country.Name;
import com.xworkz.task.things.boot.country.President;

public class CountryRunner {

	public static void main(String[] args) {

	President presedent=new President("Narendra modi");
	
	Country country=new Country(presedent, "india", "Delhi");
	Name name=new Name("bendakaluru", "banglore", "electronic city");
	City city=new City(name, "Karnataka", 420);
	
	Name name1=new Name("ballari", "bellery", "stell city");
	City city1=new City(name1, "Karnataka", 500);
	
	
	
	City[] array= {city,city1};
	
		country.setcities(array);
		
	country.showOff();
		

	}

}
