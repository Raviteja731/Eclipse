package com.xworkz.component.dto;

public class EducationDto {

	private String name;
	private int age;
	private String schoolName;
	private String collageName;
	private int schoolPercent;
	private int collagePercent;
	private String DegreeCollage;
	private int degreePercent;
	private boolean working;
	private boolean sucess;
	
	public EducationDto(String name, int age, String schoolName, String collageName, int schoolPercent,
			int collagePercent, String degreeCollage, int degreePercent, boolean working, boolean sucess) {
		super();
		System.out.println("Created EducationDto...."+getClass().getSimpleName());
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
		this.collageName = collageName;
		this.schoolPercent = schoolPercent;
		this.collagePercent = collagePercent;
		DegreeCollage = degreeCollage;
		this.degreePercent = degreePercent;
		this.working = working;
		this.sucess = sucess;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public int getSchoolPercent() {
		return schoolPercent;
	}

	public void setSchoolPercent(int schoolPercent) {
		this.schoolPercent = schoolPercent;
	}

	public int getCollagePercent() {
		return collagePercent;
	}

	public void setCollagePercent(int collagePercent) {
		this.collagePercent = collagePercent;
	}

	public String getDegreeCollage() {
		return DegreeCollage;
	}

	public void setDegreeCollage(String degreeCollage) {
		DegreeCollage = degreeCollage;
	}

	public int getDegreePercent() {
		return degreePercent;
	}

	public void setDegreePercent(int degreePercent) {
		this.degreePercent = degreePercent;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public boolean isSucess() {
		return sucess;
	}

	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}

	@Override
	public String toString() {
		return "EducationDto [name=" + name + ", age=" + age + ", schoolName=" + schoolName + ", collageName="
				+ collageName + ", schoolPercent=" + schoolPercent + ", collagePercent=" + collagePercent
				+ ", DegreeCollage=" + DegreeCollage + ", degreePercent=" + degreePercent + ", working=" + working
				+ ", sucess=" + sucess + "]";
	}
	
	
	
	
}
