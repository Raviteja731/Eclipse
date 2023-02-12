package com.xworkz.controller.dto.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.controller.dto.BakeryDto;

@Repository
public class BakeryRepoImple implements BakeryRepository {

	public BakeryRepoImple() {
		System.out.println("Created BakeryRepoImple"+getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BakeryDto dto) {
		System.out.println("Created save..");
		return true;
	}
	
	

}
