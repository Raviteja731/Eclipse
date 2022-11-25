package com.xwork.equal;

public class Mobile {

	private String brand;
	private String colour;
	private String shopName;
	private int price;
	private String manufCountry;
	private int manufYear;
	private double weight;
	private int ram;
	private int rom;
	private boolean good;
	
	public Mobile(String brand, String colour, String shopName, int price, String manufCountry, int manufYear,
			double weight, int ram, int rom, boolean good) {
		this.brand = brand;
		this.colour = colour;
		this.shopName = shopName;
		this.price = price;
		this.manufCountry = manufCountry;
		this.manufYear = manufYear;
		this.weight = weight;
		this.ram = ram;
		this.rom = rom;
		this.good = good;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", colour=" + colour + ", shopName=" + shopName + ", price=" + price
				+ ", manufCountry=" + manufCountry + ", manufYear=" + manufYear + ", weight=" + weight + ", ram=" + ram
				+ ", rom=" + rom + ", good=" + good + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals Method");
		if(obj instanceof Mobile) {
			System.out.println("checking obj is instance of god");
			Mobile mobile= (Mobile)obj;
			if(this.brand.equals(mobile.brand)&& this.colour.equals(mobile.colour)&& this.shopName.equals(mobile.shopName)&& this.manufCountry.equals(mobile.manufCountry)) {
				System.out.println("checking obj is equal to god,u can procced");
				return true;
			}
			else {
				System.out.println("checking obj is equal to god,u cannot procced");
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufCountry() {
		return manufCountry;
	}

	public void setManufCountry(String manufCountry) {
		this.manufCountry = manufCountry;
	}

	public int getManufYear() {
		return manufYear;
	}

	public void setManufYear(int manufYear) {
		this.manufYear = manufYear;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}
	
	
}
