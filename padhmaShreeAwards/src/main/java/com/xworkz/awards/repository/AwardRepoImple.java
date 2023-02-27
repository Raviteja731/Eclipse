package com.xworkz.awards.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.awards.entity.AwardEntity;

@Repository
public class AwardRepoImple implements AwardRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AwardRepoImple() {
		System.out.println("Running AwardRepoImple.." + getClass().getSimpleName());
	}

	@Override
	public boolean save(AwardEntity awardEntity) {
		System.out.println("Running save..");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(awardEntity);
		transaction.commit();
		manager.close();
		return true;
	}

	public AwardEntity findBy(int id) {

		System.out.println("Running findBy...");
		EntityManager manager = entityManagerFactory.createEntityManager();
		AwardEntity entity = manager.find(AwardEntity.class, id);
		manager.close();

		return entity;
	}

}
