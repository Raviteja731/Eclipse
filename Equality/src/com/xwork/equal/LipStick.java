package com.xwork.equal;

public class LipStick {

	private String brand;
	private String shopName;
	private int price;
	private double quantity;
	private boolean goodForSkin;
	private String quality;
	private String manufCountry;
	private int manufYear;
	private int experiYear;
	private String usedBy;
	
	public LipStick(String brand, String shopName, int price, double quantity, boolean goodForSkin, String quality,
			String manufCountry, int manufYear, int experiYear, String usedBy) {
		this.brand = brand;
		this.shopName = shopName;
		this.price = price;
		this.quantity = quantity;
		this.goodForSkin = goodForSkin;
		this.quality = quality;
		this.manufCountry = manufCountry;
		this.manufYear = manufYear;
		this.experiYear = experiYear;
		this.usedBy = usedBy;
	}

	@Override
	public String toString() {
		return "LipStick [brand=" + brand + ", shopName=" + shopName + ", price=" + price + ", quantity=" + quantity
				+ ", goodForSkin=" + goodForSkin + ", quality=" + quality + ", manufCountry=" + manufCountry
				+ ", manufYear=" + manufYear + ", experiYear=" + experiYear + ", usedBy=" + usedBy + "]";
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Running Equals Method");
			if(obj instanceof LipStick)
			{
				System.out.println("Checking Equals Method");
				LipStick lipStick = (LipStick)obj;
				if(this.brand.equals(lipStick.brand)&& this.manufCountry.equals(lipStick.manufCountry)&& this.shopName.equals(lipStick.shopName))
				{
					System.out.println("Checking Equals,it is equal u can poocced");
					return true;
				}
				else {
					System.out.println("Checking Equals,it is equal u cannot poocced");
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public boolean isGoodForSkin() {
		return goodForSkin;
	}

	public void setGoodForSkin(boolean goodForSkin) {
		this.goodForSkin = goodForSkin;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
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

	public int getExperiYear() {
		return experiYear;
	}

	public void setExperiYear(int experiYear) {
		this.experiYear = experiYear;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}
	
	
}
