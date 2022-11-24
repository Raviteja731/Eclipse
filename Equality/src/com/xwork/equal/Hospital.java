package com.xwork.equal;

public class Hospital {

	private String name;
	private String location;
	private String city;
	private String state;
	private String ownerName;
	private int noOfNurse;
	private int noOfBoys;
	private boolean superSpecilaty;
	private int entryFees;
	private boolean goodDoctors;
	
	public Hospital(String name, String location, String city, String state, String ownerName, int noOfNurse,
			int noOfBoys, boolean superSpecilaty, int entryFees, boolean goodDoctors) {
		this.name = name;
		this.location = location;
		this.city = city;
		this.state = state;
		this.ownerName = ownerName;
		this.noOfNurse = noOfNurse;
		this.noOfBoys = noOfBoys;
		this.superSpecilaty = superSpecilaty;
		this.entryFees = entryFees;
		this.goodDoctors = goodDoctors;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", city=" + city + ", state=" + state
				+ ", ownerName=" + ownerName + ", noOfNurse=" + noOfNurse + ", noOfBoys=" + noOfBoys
				+ ", superSpecilaty=" + superSpecilaty + ", entryFees=" + entryFees + ", goodDoctors=" + goodDoctors
				+ "]";
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Running Equals Method");
			if(obj instanceof Hospital)
			{
				System.out.println("Checking obj instanceof");
				Hospital hospital = (Hospital)obj;
				if(this.name.equals(hospital.name)&& this.city.equals(hospital.city)&& this.location.equals(hospital.location))
				{
					System.out.println("Checking Equal,it is equal u can proceed");
					return true;
				}
				else {
					System.out.println("Checking Equal,it is equal u cannot proceed");
				}
			}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNoOfNurse() {
		return noOfNurse;
	}

	public void setNoOfNurse(int noOfNurse) {
		this.noOfNurse = noOfNurse;
	}

	public int getNoOfBoys() {
		return noOfBoys;
	}

	public void setNoOfBoys(int noOfBoys) {
		this.noOfBoys = noOfBoys;
	}

	public boolean isSuperSpecilaty() {
		return superSpecilaty;
	}

	public void setSuperSpecilaty(boolean superSpecilaty) {
		this.superSpecilaty = superSpecilaty;
	}

	public int getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}

	public boolean isGoodDoctors() {
		return goodDoctors;
	}

	public void setGoodDoctors(boolean goodDoctors) {
		this.goodDoctors = goodDoctors;
	}
	
	
}
