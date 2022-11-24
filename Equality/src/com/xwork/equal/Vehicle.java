package com.xwork.equal;

public class Vehicle {

	private String brand;
	private String carName;
	private String brandAmbsader;
	private String ShowroomName;
	private int showRoomEstab;
	private String ownerName;
	private double carPrice;
	private double secondHandelPrice;
	private double manufCost;
	private boolean comfort;
	
	public Vehicle(String brand, String carName, String brandAmbsader, String showroomName, int showRoomEstab,
			String ownerName, double carPrice, double secondHandelPrice, double manufCost, boolean comfort) {
		this.brand = brand;
		this.carName = carName;
		this.brandAmbsader = brandAmbsader;
		ShowroomName = showroomName;
		this.showRoomEstab = showRoomEstab;
		this.ownerName = ownerName;
		this.carPrice = carPrice;
		this.secondHandelPrice = secondHandelPrice;
		this.manufCost = manufCost;
		this.comfort = comfort;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", carName=" + carName + ", brandAmbsader=" + brandAmbsader
				+ ", ShowroomName=" + ShowroomName + ", showRoomEstab=" + showRoomEstab + ", ownerName=" + ownerName
				+ ", carPrice=" + carPrice + ", secondHandelPrice=" + secondHandelPrice + ", manufCost=" + manufCost
				+ ", comfort=" + comfort + "]";
	}
	
	public boolean equals(Object obj) 
	{
		System.out.println("Running Equals Method");
		if(obj instanceof Vehicle) {
			System.out.println("Checking obj is instance of god");
			Vehicle vehicle = (Vehicle)obj;
			if(this.brand.equals(vehicle.brand)&& this.brandAmbsader.equals(vehicle.brandAmbsader)) 
			{
				System.out.println("Checking equals method,it is equal u can prooced");
				return true;
			}
			else {
				System.out.println("Checking equals method,it is equal u cannot prooced");
			}
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getBrandAmbsader() {
		return brandAmbsader;
	}

	public void setBrandAmbsader(String brandAmbsader) {
		this.brandAmbsader = brandAmbsader;
	}

	public String getShowroomName() {
		return ShowroomName;
	}

	public void setShowroomName(String showroomName) {
		ShowroomName = showroomName;
	}

	public int getShowRoomEstab() {
		return showRoomEstab;
	}

	public void setShowRoomEstab(int showRoomEstab) {
		this.showRoomEstab = showRoomEstab;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public double getSecondHandelPrice() {
		return secondHandelPrice;
	}

	public void setSecondHandelPrice(double secondHandelPrice) {
		this.secondHandelPrice = secondHandelPrice;
	}

	public double getManufCost() {
		return manufCost;
	}

	public void setManufCost(double manufCost) {
		this.manufCost = manufCost;
	}

	public boolean isComfort() {
		return comfort;
	}

	public void setComfort(boolean comfort) {
		this.comfort = comfort;
	}
	
	
}
