package com.xworkz.awards.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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

	@Override
	public AwardEntity findBy(int id) {

		System.out.println("Running findBy...");
		EntityManager manager = entityManagerFactory.createEntityManager();
		AwardEntity entity = manager.find(AwardEntity.class, id);
		manager.close();

		return entity;
	}

	@Override
	public List<AwardEntity> findByAwardName(String AwardName) {
		System.out.println("Running findByAwardName in repoImpl...");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
		Query query = entityManager.createNamedQuery("findByAwardName");
		query.setParameter("by", AwardName);
		List<AwardEntity> list = query.getResultList();
		if (AwardName != null && !list.isEmpty()) {
			System.out.println(list.size());
			return list;
		}
		}
		finally {
			entityManager.close();
		}
		return AwardRepository.super.findByAwardName(AwardName);
	}

	@Override
	public boolean update(AwardEntity awardEntity) {
		System.out.println("Running update");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.merge(awardEntity);
	entityTransaction.commit();
	return true;
		}finally {
			entityManager.close();
		}
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running delete");
	EntityManager entityManager=	entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=	entityManager.getTransaction();
AwardEntity awardEntity = entityManager.find(AwardEntity.class, id);
entityTransaction.begin();
entityManager.remove(awardEntity);
entityTransaction.commit();
entityManager.close();
		return true;
	}

	
	
}
