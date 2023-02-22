package com.xworkz.singles.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.xworkz.singles.dto.SinglesDTO;

@Repository
public class SinglesRepoImple implements SinglesRepo {

	@Autowired
	private LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;
	
	@PersistenceUnit
	private EntityManagerFactory managerFactory;
	
	
public SinglesRepoImple() {
	System.out.println("running SinglesRepoImple..."+getClass().getSimpleName());
}	
	@Override
	public boolean save(SinglesDTO dto) {
		System.out.println("Running save...");
EntityManager entityManager = managerFactory.createEntityManager();
EntityTransaction transaction = entityManager.getTransaction();
transaction.begin();
entityManager.persist(dto);
transaction.commit();
entityManager.close();
System.out.println();
		return true;
	}

}
