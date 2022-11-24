package com.xwork.equal;

public class Paint {

	private String brand;
	private String colour;
	private int colourCode;
	private String shopName;
	private String ownweName;
	private int price;
	private double quantity;
	private boolean quality;
	private String type;     		// powder or liquid
	private double tinWeight;
	
	
	public Paint(String brand, String colour, int colourCode, String shopName, String ownweName, int price,
			double quantity, boolean quality, String type, double tinWeight) {
		this.brand = brand;
		this.colour = colour;
		this.colourCode = colourCode;
		this.shopName = shopName;
		this.ownweName = ownweName;
		this.price = price;
		this.quantity = quantity;
		this.quality = quality;
		this.type = type;
		this.tinWeight = tinWeight;
	}


	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", colour=" + colour + ", colourCode=" + colourCode + ", shopName=" + shopName
				+ ", ownweName=" + ownweName + ", price=" + price + ", quantity=" + quantity + ", quality=" + quality
				+ ", type=" + type + ", tinWeight=" + tinWeight + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equal method");
		if (obj instanceof Paint){
			System.out.println("Checking obj is equal to paint");
			Paint paint = (Paint)obj;
			if(this.brand.equals(paint.brand)) {
				System.out.println("Checking obj is equal to paint,it is equal");
				return true;
			}
			else {
				System.out.println("Checking obj is equal to paint,it is not equal");
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

	public int getColourCode() {
		return colourCode;
	}

	public void setColourCode(int colourCode) {
		this.colourCode = colourCode;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getOwnweName() {
		return ownweName;
	}

	public void setOwnweName(String ownweName) {
		this.ownweName = ownweName;
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

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTinWeight() {
		return tinWeight;
	}

	public void setTinWeight(double tinWeight) {
		this.tinWeight = tinWeight;
	}
	
}
