package com.xworkz.aeroplane.repository;

import com.xworkz.aeroplane.Entity.AeroplaneEntity;

public interface AeroplaneRepo {

	boolean save(AeroplaneEntity aeroplaneEntity);

	default AeroplaneEntity findBy(int id) {
		System.out.println("Running the finby in AeroplaneRepository");
		return null;
	}
}
