package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBio {

	@Autowired
	@Qualifier("myName")
	private String name;
	@Autowired
	@Qualifier("age")
	private int age;
	@Autowired
	@Qualifier("mobileNo")
	private long mobileNo;
	@Autowired
	@Qualifier("height")
	private double height;
	@Autowired
	@Qualifier("weight")
	private double weight;
	@Autowired
	@Qualifier("single")
	private boolean single;
	@Autowired
	@Qualifier("city")
	private String city;
	@Autowired
	@Qualifier("workingCompany")
	private String company;
	@Autowired
	@Qualifier("experince")
	private int exp;
	@Autowired
	@Qualifier("alive")
	private boolean alive;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
	public String getCompany() {
		return company;
	}
	
	public int getExp() {
		return exp;
	}
	
	public double getHeight() {
		return height;
	}
	
	public long getMobileNo() {
		return mobileNo;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	public boolean getSingle() {
		return single;
	}
}
