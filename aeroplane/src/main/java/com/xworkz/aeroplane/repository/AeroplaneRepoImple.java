package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.Entity.AeroplaneEntity;
import com.xworkz.aeroplane.dto.AeroplaneDTO;

@Repository
public class AeroplaneRepoImple implements AeroplaneRepo {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroplaneRepoImple() {
		System.out.println("Created AeroplaneRepoImple"+getClass().getSimpleName());
	}
	
	@Override
	public boolean save(AeroplaneEntity aeroplaneEntity) {
		System.out.println("Running the save in repo impl...");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aeroplaneEntity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}

	@Override
	public AeroplaneEntity findBy(int id) {
		System.out.println("Running find by id in repo:" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AeroplaneEntity entity = entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		
		return entity;
	}
	
}
