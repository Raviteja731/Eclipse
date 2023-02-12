package com.xworkz.controller.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.xworkz.controller.dto.CasinoDTO;

@Repository
public class CasinoRepoImple implements CasinoRepository {
	@Autowired
	private LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	public CasinoRepoImple() {
		System.out.println("Created CasinoRepoImple..." + getClass().getSimpleName());
	}

	@Override
	public boolean save(CasinoDTO dto) {
		System.out.println("Created save Running...");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();

		System.out.println("Created save sucessfully...");

		return true;
	}
}
