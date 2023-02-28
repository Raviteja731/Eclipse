package com.xworkz.awards.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.awards.entity.AwardEntity;

public interface AwardRepository {

	boolean save(AwardEntity awardEntity);
	
	 AwardEntity findBy(int id) ;
	 
	 default List<AwardEntity> findByAwardName(String AwardName) {
		return Collections.emptyList();
		 
		 
	 }
}
