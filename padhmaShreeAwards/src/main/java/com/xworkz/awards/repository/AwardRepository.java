package com.xworkz.awards.repository;

import com.xworkz.awards.entity.AwardEntity;

public interface AwardRepository {

	boolean save(AwardEntity awardEntity);
	
	default AwardEntity findBy(int id) {
		System.out.println("Running the findby in AwardEntity");
		return null;
	}
}
