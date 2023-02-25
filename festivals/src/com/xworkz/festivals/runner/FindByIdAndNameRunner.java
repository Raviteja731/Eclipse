package com.xworkz.festivals.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByIdAndNameRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager =	factory.createEntityManager();
		Query query =manager.createNamedQuery("findByIdAndName");
		query.setParameter("by", "GaneshChaturthi");
		int id=  (int) query.getSingleResult();
		System.out.println(id);


	}

}
