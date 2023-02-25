package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.ForestEntity;

public class ForestNameRunner {

	public static void main(String[] args) {

		ForestEntity entity = new ForestEntity();
		entity.setArea("reviteja");
		entity.setName("manoj");
		entity.setState("karnataka");
		entity.setType("lion");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		System.out.println(entity);


	}

}
