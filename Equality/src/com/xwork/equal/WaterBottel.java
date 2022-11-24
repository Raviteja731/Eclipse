package com.xwork.equal;

public class WaterBottel {

	private String brand;
	private String companyName;
	private String ownerName;
	private String wifeName;
	private int companyEstab;
	private boolean waterFiltered;
	private int price;
	private double bottelLength;
	private double bottelPrice;
	private String brandAmbaseder;
	
	public WaterBottel(String brand, String companyName, String ownerName, String wifeName, int companyEstab,
			boolean waterFiltered, int price, double bottelLength, double bottelPrice, String brandAmbaseder) {
		this.brand = brand;
		this.companyName = companyName;
		this.ownerName = ownerName;
		this.wifeName = wifeName;
		this.companyEstab = companyEstab;
		this.waterFiltered = waterFiltered;
		this.price = price;
		this.bottelLength = bottelLength;
		this.bottelPrice = bottelPrice;
		this.brandAmbaseder = brandAmbaseder;
	}

	@Override
	public String toString() {
		return "WaterBottel [brand=" + brand + ", companyName=" + companyName + ", ownerName=" + ownerName
				+ ", wifeName=" + wifeName + ", companyEstab=" + companyEstab + ", waterFiltered=" + waterFiltered
				+ ", price=" + price + ", bottelLength=" + bottelLength + ", bottelPrice=" + bottelPrice
				+ ", brandAmbaseder=" + brandAmbaseder + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals Method");
		if(obj instanceof WaterBottel) {
			System.out.println("checking obj is instance of god");
			WaterBottel Bottel= (WaterBottel)obj;
			if( this.brand.equals(Bottel.brand)) {
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public int getCompanyEstab() {
		return companyEstab;
	}

	public void setCompanyEstab(int companyEstab) {
		this.companyEstab = companyEstab;
	}

	public boolean isWaterFiltered() {
		return waterFiltered;
	}

	public void setWaterFiltered(boolean waterFiltered) {
		this.waterFiltered = waterFiltered;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getBottelLength() {
		return bottelLength;
	}

	public void setBottelLength(double bottelLength) {
		this.bottelLength = bottelLength;
	}

	public double getBottelPrice() {
		return bottelPrice;
	}

	public void setBottelPrice(double bottelPrice) {
		this.bottelPrice = bottelPrice;
	}

	public String getBrandAmbaseder() {
		return brandAmbaseder;
	}

	public void setBrandAmbaseder(String brandAmbaseder) {
		this.brandAmbaseder = brandAmbaseder;
	}
	
	
}
