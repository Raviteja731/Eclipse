package com.xworkz.base;

public class PreWeddingShoot {

	public String ShopName;
	public String location;
	public int price;
	
	public PreWeddingShoot(String shopName, String location, int price) {
		ShopName = shopName;
		this.location = location;
		this.price = price;
	}
	public void PreWeddingShoot(Photos photos)
	{
		System.out.println(photos.location);
		System.out.println(photos.price);
		System.out.println(photos.ShopName);
	}
	
}
