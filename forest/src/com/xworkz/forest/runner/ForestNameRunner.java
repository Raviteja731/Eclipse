package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ForestNameRunner {

	public static void main(String[] args) {

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createNamedQuery("findByName");
		Object obj = query.getResultList();
		System.out.println(obj);

	}

}
