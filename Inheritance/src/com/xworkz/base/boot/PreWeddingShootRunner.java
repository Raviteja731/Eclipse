package com.xworkz.base.boot;

import com.xworkz.base.Photos;
import com.xworkz.base.PreWeddingShoot;

public class PreWeddingShootRunner {

	public static void main(String[] args) {

		PreWeddingShoot preShoot = new PreWeddingShoot("Preethi Photos & MarriageVideos", "Ooty", 10000);
		
		PreWeddingShoot preShoot2 = new Photos("Preethi Photos & MarriageVideos", "Ooty", 10000);
		
		Photos photos = new Photos("Preethi Photos & MarriageVideos", "Ooty", 10000);
		
		preShoot.PreWeddingShoot(photos);
		
		System.out.println(preShoot.ShopName);
		System.out.println(preShoot2.location);
		System.out.println(photos.price);
	}

}
