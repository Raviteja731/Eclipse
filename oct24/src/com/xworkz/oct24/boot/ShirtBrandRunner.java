package com.xworkz.oct24.boot;

import com.xworkz.oct24.ShirtBrand;

public class ShirtBrandRunner {
           
	public static void main(String[] args) {

		ShirtBrand brand = new ShirtBrand(30);
		brand.shopName ="Janatha Cloths" ;
		brand.Brand = "Omkar";
		
		
		brand.display();
	}

}
