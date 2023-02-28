package com.xworkz.movies.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.movies.entity.MovieEntity;

public class MovieRepoImple implements MovieRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public MovieRepoImple() {
		System.out.println("Created MovieRepoImple.."+getClass().getSimpleName());
	}
	
	@Override
	public boolean save(MovieEntity entity) {
		System.out.println("Created save..");
	EntityManager entityManager =	entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=	entityManager.getTransaction();
entityTransaction.begin();
entityManager.persist(entity);
entityTransaction.commit();
entityManager.close();

return false;
	}

	@Override
	public MovieEntity findby(int id) {
		System.out.println("Created findby..");
		return null;
	}

}
