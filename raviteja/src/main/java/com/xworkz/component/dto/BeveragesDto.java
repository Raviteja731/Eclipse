package com.xworkz.component.dto;

public class BeveragesDto {

	private String brand;
	private double price;
	private double weight;
	private boolean tastey;
	private String bottleColor;
	private String manufaCompany;
	private int localdate;
	private int manufaYear;
	
	public BeveragesDto() {
		System.out.println("created BeveragesDto...."+getClass().getSimpleName());
	}

	
	public BeveragesDto(String brand, double price, double weight, boolean tastey, String bottleColor,
			String manufaCompany, int localdate, int manufaYear) {
		super();
		this.brand = brand;
		this.price = price;
		this.weight = weight;
		this.tastey = tastey;
		this.bottleColor = bottleColor;
		this.manufaCompany = manufaCompany;
		this.localdate = localdate;
		this.manufaYear = manufaYear;
	}


	@Override
	public String toString() {
		return "BeveragesDto [brand=" + brand + ", price=" + price + ", weight=" + weight + ", tastey=" + tastey
				+ ", bottleColor=" + bottleColor + ", manufaCompany=" + manufaCompany + ", localdate=" + localdate
				+ ", manufaYear=" + manufaYear + "]";
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isTastey() {
		return tastey;
	}

	public void setTastey(boolean tastey) {
		this.tastey = tastey;
	}

	public String getBottleColor() {
		return bottleColor;
	}

	public void setBottleColor(String bottleColor) {
		this.bottleColor = bottleColor;
	}

	public String getManufaCompany() {
		return manufaCompany;
	}

	public void setManufaCompany(String manufaCompany) {
		this.manufaCompany = manufaCompany;
	}

	public int getLocaldate() {
		return localdate;
	}

	public void setLocaldate(int localdate) {
		this.localdate = localdate;
	}

	public int getManufaYear() {
		return manufaYear;
	}

	public void setManufaYear(int manufaYear) {
		this.manufaYear = manufaYear;
	}
	
	
	
}
