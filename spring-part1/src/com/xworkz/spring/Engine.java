package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Autowired
	@Qualifier("engineName")
	private String name;
	@Autowired
	private String type;
	@Autowired
	private int number;
	@Autowired
	private int version;
	@Autowired
	private String company;
	@Autowired
	private int strokes;
	
	public Engine(String name, String type, String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Autowired
	public int getStrokes() {
		return strokes;
	}
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
	
	
}
