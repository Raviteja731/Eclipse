package com.xworkz.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.forest.dto.ForestDto;

public class ForestRepoImpl implements ForestRepo {

	@Override
	public boolean save(ForestDto dto) {
		System.out.println("created save...");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entity = entityManager.getTransaction();
		entity.begin();
		entityManager.persist(dto1);
		entity.commit();
		entityManager.close();
		return true;

	}

}
