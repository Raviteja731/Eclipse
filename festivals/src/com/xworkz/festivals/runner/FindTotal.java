package com.xworkz.festivals.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festivalsEntity.FestivalsEntity;

public class FindTotal {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("FindTotaldays");
		Object object = query.getSingleResult();
		long entity = (long) object;
		System.out.println(entity);

	}

}
