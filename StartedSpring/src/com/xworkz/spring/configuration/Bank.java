package com.xworkz.spring.configuration;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.Power;

@Configuration
@ComponentScan("com.xworkz.spring.configuration")
public class Bank {

	@Bean
	public String RBI()
	{
	System.out.println("Registring to spring.....");
	String ref = new String();
		return "Darshan";
	}
	
	@Bean
	public String SBI()
	{
	System.out.println("Registring to spring.....");
	String ref = new String();
		return "Karthi";
	}
	
	@Bean
	public String HBI()
	{
	System.out.println("Registring to spring.....");
	String ref = new String();
		return "Akshay";
	}
	
	@Bean
	public String PBI()
	{
	System.out.println("Registring to spring.....");
	String ref = new String();
		return "Shubam";
	}
	
	@Bean
	public String PKGB()
	{
	System.out.println("Registring to spring.....");
	String ref = new String();
		return "Manu";
	}
	
	@Bean
	public double TicketPrice()
	{
	System.out.println("Registring to spring.....");
		return 0;
	}
	
	@Bean
	public double BusTicket()
	{
	System.out.println("Registring to spring.....");
		return 420;
	}
	
	@Bean
	public double FlightTicket()
	{
	System.out.println("Registring to spring.....");
		return 108;
	}
	
	@Bean
	public double MovieTicket()
	{
	System.out.println("Registring to spring.....");
		return 150;
	}
	
	@Bean
	public double ParkTicket()
	{
	System.out.println("Registring to spring.....");
		return 20;
	}
	
	@Bean
	public boolean Alive()
	{
	System.out.println("Registring to spring.....");
		return true;
	}
	
	@Bean
	public boolean Sweet()
	{
	System.out.println("Registring to spring.....");
		return true;
	}
	
	@Bean
	public boolean Salt()
	{
	System.out.println("Registring to spring.....");
		return true;
	}
	
	@Bean
	public boolean Dead()
	{
	System.out.println("Registring to spring.....");
		return true;
	}
	
	@Bean
	public boolean Beautiful()
	{
	System.out.println("Registring to spring.....");
		return false;
	}
	
	@Bean
	public StringBuffer Surya()
	{
	System.out.println("Registring to spring.....");
		StringBuffer ref = new StringBuffer();
		return ref;
	}
	
	@Bean
	public StringBuffer Karthi()
	{
	System.out.println("Registring to spring.....");
		StringBuffer ref1 = new StringBuffer();
		return ref1;
	}
	
	@Bean
	public StringBuffer Darshan()
	{
	System.out.println("Registring to spring....."); 
		StringBuffer ref2 = new StringBuffer();
		return ref2;
	}
	
	@Bean
	public StringBuffer Hareesha()
	{
	System.out.println("Registring to spring.....");
		StringBuffer ref3 = new StringBuffer();
		return ref3;
	}
	
	@Bean
	public StringBuffer Shubam()
	{
	System.out.println("Registring to spring.....");
		StringBuffer ref4 = new StringBuffer();
		return ref4;
	}
	
	@Bean
	public ArrayList AllOK()
	{
	System.out.println("Registring to spring.....");
		List<Boolean> ref5 = Stream.of(true,true,false).collect(Collectors.toList());
		return (ArrayList) ref5;
	}
	
	@Bean
	public Map All()
	{
	System.out.println("Registring to spring.....");
		Map<String, Integer> map = new Hashtable();
		map.put("Surya", 1);
		map.put("Sudeep", 2);
		map.put("Chiru", 3);
		map.put("Pawan", 4);
		map.put("Nag", 5);
		return map;
	}
	
	
	
	
	
	
}
