package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {

	@Autowired
	@Qualifier("ghostName")
	private String name;
	@Autowired
	private String gender;
	@Autowired
	private long mobileNo;
	@Autowired
	private double height;
	@Autowired
	private double weight;
	@Autowired
	private String city;
	@Autowired
	private boolean alive;
	@Autowired
	private boolean single;
	@Autowired
	@Qualifier("ghostColour")
	private String colour;
	@Autowired
	private String hairColour;
	@Autowired
	private String fatherName;
	@Autowired
	private String motherName;
	@Autowired
	private int age;
	@Autowired
	private boolean hudugiSuper;
	@Autowired
	private String exName;
	@Autowired
	private String reason;
	@Autowired
	private int birthYear;
	@Autowired
	private int deathyear;
	@Autowired
	private String nationality;
	@Autowired
	private String education;
	
	@Autowired
	public Ghost(String name, String gender, long mobileNo, double height, double weight, String city, boolean alive,
			boolean single, String colour, String hairColour) {
		super();
		this.name = name;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.height = height;
		this.weight = weight;
		this.city = city;
		this.alive = alive;
		this.single = single;
		this.colour = colour;
		this.hairColour = hairColour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean getAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public boolean getSingle() {
		return single;
	}
	public void setSingle(boolean single) {
		this.single = single;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getHairColour() {
		return hairColour;
	}
	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getHudugiSuper() {
		return hudugiSuper;
	}
	public void setHudugiSuper(boolean hudugiSuper) {
		this.hudugiSuper = hudugiSuper;
	}
	public String getExName() {
		return exName;
	}
	public void setExName(String exName) {
		this.exName = exName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getDeathyear() {
		return deathyear;
	}
	public void setDeathyear(int deathyear) {
		this.deathyear = deathyear;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	
}
