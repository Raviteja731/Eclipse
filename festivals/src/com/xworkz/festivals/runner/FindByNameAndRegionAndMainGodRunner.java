package com.xworkz.festivals.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByNameAndRegionAndMainGodRunner {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("FindByNameAndRegionAndMainGod");
		query.setParameter("rby", "Hindu");

		query.setParameter("byy", "Ganesh");

		Object object = query.getResultList();
		System.out.println(object);

	}

}
