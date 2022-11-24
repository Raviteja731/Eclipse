package com.xwork.equal;

public class Institution {

	private String institueName;
	private String Owner;
	private String location;
	private String city;
	private String State;
	private String wifeName;
	private int fees;
	private int trainingPeriod;
	private int noOfTrinees;
	private int noOfFloors;
	
	public Institution(String institueName, String owner, String location, String city, String state, String wifeName,
			int fees, int trainingPeriod, int noOfTrinees, int noOfFloors) {
		this.institueName = institueName;
		Owner = owner;
		this.location = location;
		this.city = city;
		State = state;
		this.wifeName = wifeName;
		this.fees = fees;
		this.trainingPeriod = trainingPeriod;
		this.noOfTrinees = noOfTrinees;
		this.noOfFloors = noOfFloors;
	}

	@Override
	public String toString() {
		return "Institution [institueName=" + institueName + ", Owner=" + Owner + ", location=" + location + ", city="
				+ city + ", State=" + State + ", wifeName=" + wifeName + ", fees=" + fees + ", trainingPeriod="
				+ trainingPeriod + ", noOfTrinees=" + noOfTrinees + ", noOfFloors=" + noOfFloors + "]";
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Running Equals Method");
			if(obj instanceof Institution )
			{
				System.out.println("Checking obj instance");
				Institution institution = (Institution)obj;
				if(this.institueName.equals(institution.institueName)&& this.city.equals(institution.city))
				{
					System.out.println("Checking equals,it is equal u can proceed");
					return true;
				}
				else {
					System.out.println("Checking equals,it is equal u cannot proceed");
				}
			}
		return false;
	}

	public String getInstitueName() {
		return institueName;
	}

	public void setInstitueName(String institueName) {
		this.institueName = institueName;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
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
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getTrainingPeriod() {
		return trainingPeriod;
	}

	public void setTrainingPeriod(int trainingPeriod) {
		this.trainingPeriod = trainingPeriod;
	}

	public int getNoOfTrinees() {
		return noOfTrinees;
	}

	public void setNoOfTrinees(int noOfTrinees) {
		this.noOfTrinees = noOfTrinees;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	
	
}
