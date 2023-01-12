package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class AllConfiguration {

	@Bean
	public String name() 
	{
		return "AK";
	}
	
	@Bean
	public String ownerName() 
	{
		return "Shubam";
	}
	
	@Bean
	public int id()
	{
		return 002;
	}
	
	@Bean
	public String lang()
	{
		return "Kannada";
	}
	
	@Bean
	public int price()
	{
		return 6;
	}
	
	@Bean
	public String engineName()
	{
		return "Shuru";
	}
	
	@Bean
	public String type()
	{
		return "PetrolEngine";
	}
	
	@Bean
	public int number()
	{
		return 420;
	}
	
	@Bean
	public int version()
	{
		return 5;
	}
	
	@Bean
	public String company()
	{
		return "Shubam";
	}
	
	@Bean
	public int strokes()
	{
		return 2;
	}
	
	@Bean
	public String snakeName()
	{
		return "Pooja";
	}
	
	@Bean
	public double length()
	{
		return 5.3;
	}
	
	@Bean
	public String colour()
	{
		return "Gold";
	}
	
	@Bean
	public String snakeType()
	{
		return "2 Head";
	}
	
	@Bean
	public boolean poisinous()
	{
		return true;
	}
	
	@Bean
	public String ghostName()
	{
		return "Ex";
	}
	
	@Bean
	public String gender()
	{
		return "Female";
	}
	
	@Bean
	public String city()
	{
		return "Hassan";
	}
	
	@Bean
	public String ghostColour()
	{
		return "Brown";
	}
	
	@Bean
	public String hairColour()
	{
		return "Black";
	}
	
	@Bean
	public String fatherName()
	{
		return "Darshan";
	}
	
	@Bean
	public String motherName()
	{
		return "Preethi";
	}
	
	@Bean
	public String exName()
	{
		return "Dont Know";
	}
	
	@Bean
	public String reason()
	{
		return "LoveFailure";
	}
	
	@Bean
	public String nationality()
	{
		return "Indian";
	}
	
	@Bean
	public String education()
	{
		return "B.Tech";
	}
	
	@Bean
	public int birthYear()
	{
		return 2001;
	}
	
	@Bean
	public int deathyear()
	{
		return 2022;
	}
	
	@Bean
	public int age()
	{
		return 21;
	}
	
	@Bean
	public long mobileNo()
	{
		return 6393579365l;
	}
	
	@Bean
	public double height()
	{
		return 4.7;
	}
	
	@Bean
	public double weight()
	{
		return 55.5;
	}
	
	@Bean
	public boolean alive()
	{
		return false;
	}
	
	@Bean
	public boolean single()
	{
		return false;
	}
	
	@Bean
	public boolean hudugiSuper()
	{
		return false;
	}
	
	
	
	
	
}
