package com.xworkz.component.dto;

public class FamilyDto {

	private String fatherName;
	private String motherName;
	private String Names;
	private int age;
	private double height;
	private double weight;
	private long mobileNo;
	private String wifeName;
	private int noFoMembers;
	private int noOfPeoples;
	
	
	public FamilyDto(String fatherName, String motherName, String name, int age, double height, double weight,
			long mobileNo, String wifeName, int noFoMembers, int noOfPeoples) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
		Names = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.mobileNo = mobileNo;
		this.wifeName = wifeName;
		this.noFoMembers = noFoMembers;
		this.noOfPeoples = noOfPeoples;
	}


	public FamilyDto() {
		System.out.println("created FamilyDto..."+getClass().getSimpleName());	
		}


	@Override
	public String toString() {
		return "FamilyDto [fatherName=" + fatherName + ", motherName=" + motherName + ", Name=" + Names + ", age=" + age
				+ ", height=" + height + ", weight=" + weight + ", mobileNo=" + mobileNo + ", wifeName=" + wifeName
				+ ", noFoMembers=" + noFoMembers + ", noOfPeoples=" + noOfPeoples + "]";
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


	public String getName() {
		return Names;
	}


	public void setName(String name) {
		Names = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
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


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getWifeName() {
		return wifeName;
	}


	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}


	public int getNoFoMembers() {
		return noFoMembers;
	}


	public void setNoFoMembers(int noFoMembers) {
		this.noFoMembers = noFoMembers;
	}


	public int getNoOfPeoples() {
		return noOfPeoples;
	}


	public void setNoOfPeoples(int noOfPeoples) {
		this.noOfPeoples = noOfPeoples;
	}
	
	
}
