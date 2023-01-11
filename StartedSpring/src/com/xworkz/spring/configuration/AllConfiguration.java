package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.Actor;
import com.xworkz.spring.Rocket;
import com.xworkz.spring.Season;

@ComponentScan("com.xworkz.spring")
@Configuration
public class AllConfiguration {

	@Bean
	public Rocket heroName()
	{
		Rocket rocket = new Rocket();
		return rocket;
	}
	
	@Bean
	public Actor heroLang()
	{
		Actor actor = new Actor("Surya","Telugu",54);
		return actor;
	}
	
	@Bean
	public Season heroAge()
	{
		Season seasons = new Season();
		seasons.setName("HogaKala");
		seasons.setDuration(4);
		seasons.setStartingMonth("June");
		return seasons;
	}
	@Bean
	public String go()
	{
		System.out.println("Running String method");
		String string = new String("Ravi");
		return string;
	}
	@Bean
	public String stop()
	{
		System.out.println("Running String1 method");
		String string1 = new String("Surya");
		return string1;
	}
	
	@Bean
	public int id()
	{
		return 001;
	}
	
	@Bean
	public String ShopName()
	{
		return "Janatha HardWare";
	}
	
	@Bean
	public String gstNo()
	{
		return "637RT873";
	}
	
	@Bean
	public String ownerName()
	{
		return "Karthik";
	}
	
	@Bean
	public String address()
	{
		return "Kolar";
	}
	
	@Bean
	public String softwareName()
	{
		return "Omegla";
	}
	
	@Bean
	public String developer()
	{
		return "Akshay";
	}
	
	@Bean
	public boolean softwareFree()
	{
		return true;
	}
	
	@Bean
	public int softwareVersion()
	{
		return 420;
	}
	
	@Bean
	public int releaseDate()
	{
		return 2023;
	}
	
	@Bean
	public String employeName()
	{
		return "Shubam";
	}
	
	@Bean
	public String companyName()
	{
		return "Google";
	}
	
	@Bean
	public long employeSalary()
	{
		return 3288898;
	}
	
	@Bean
	public int employeExp()
	{
		return 12;
	}
	
	@Bean
	public String pencilName()
	{
		return "Nataraj";
	}
	
	@Bean
	public String pencilColour()
	{
		return "Red";
	}
	
	@Bean
	public int pencilPrice()
	{
		return 7;
	}
	
	@Bean
	public boolean pencilSharp()
	{
		return true;
	}
	
	@Bean
	public boolean pencilStolean()
	{
		return true;
	}
	
	@Bean
	public String rubberName()
	{
		return "Camel";
	}
	
	@Bean
	public int rubberPrice()
	{
		return 5;
	}
	
	@Bean
	public String rubberColour()
	{
		return "White";
	}
	
	@Bean
	public String rubberShape()
	{
		return "Rectangle";
	}
	
	@Bean
	public boolean rubberStolen()
	{
		return true;
	}
	
	@Bean
	public int rubberSize()
	{
		return 05;
	}

	
	@Bean
	public String myName()
	{
		return "Raviteja";
	}
	
	@Bean
	public int age()
	{
		return 24;
	}
	
	@Bean
	public long mobileNo()
	{
		return 7026167838l;
	}
	
	@Bean
	public double height()
	{
		return 5.10;
	}
	
	@Bean
	public double weight()
	{
		return 65.0;
	}
	
	@Bean
	public boolean single()
	{
		return true;
	}
	
	@Bean
	public String city()
	{
		return "Bellary";
	}
	
	@Bean
	public String workingCompany()
	{
		return "ISRO";
	}
	
	@Bean
	public int experince()
	{
		return 6;
	}
	
	@Bean
	public boolean alive()
	{
		return true;
	}



}
