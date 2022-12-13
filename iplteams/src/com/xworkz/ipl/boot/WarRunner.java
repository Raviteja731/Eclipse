package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.repository.WarRepoImpleme;

public class WarRunner {

	public static void main(String[] args) {

		WarRepoImpleme imp = new WarRepoImpleme();
		
		WarDTO dt = new WarDTO();
		
		dt.setName("Russia Ukrarain War");
		dt.setStartdate(LocalDateTime.now());
		dt.setEndDate(LocalDateTime.of(0, 0, 0, 0, 0));
		dt.setStartedBy("Russia");
		dt.setStartedWith("Ukrain");
		dt.setWonBy("Russia");
		dt.setNoOfDeaths(420);
		
		WarDTO dt1 = new WarDTO();

		dt1.setName("Russia Ukrarain War");
		dt1.setStartdate(LocalDateTime.now());
		dt1.setEndDate(LocalDateTime.of(0, 0, 0, 0, 0));
		dt1.setStartedBy("Russia");
		dt1.setStartedWith("Ukrain");
		dt1.setWonBy("Russia");
		dt1.setNoOfDeaths(420);
		
		imp.create(dt);
		imp.total();
		
		imp.create(dt1);
		
		
		WarDTO dt11 = imp.findByStartDateAndEndDate(LocalDateTime.of(1955, 11, 9, 12, 56), LocalDateTime.MAX);
		System.out.println(dt11);
		System.out.println(imp.total());
		

		
	}

}
