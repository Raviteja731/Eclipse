package com.xworkz.festivals.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festivalsEntity.FestivalsEntity;

public class MainRunner {

	public static void main(String[] args) {

		FestivalsEntity festivalsEntity = new FestivalsEntity("GaneshChaturthi", "Hindu", 3, "mamoos", "Ganesh");
		FestivalsEntity festivalsEntity1 = new FestivalsEntity("HanumanJayanthi", "Hindu", 1, "sweet", "Hanuman");
		FestivalsEntity festivalsEntity2 = new FestivalsEntity("Shivarathri", "Hindu", 1, "Voggani", "Shiva");
		FestivalsEntity festivalsEntity3 = new FestivalsEntity("Dasara", "Hindu", 9, "Holegay", "Devi");
		FestivalsEntity festivalsEntity4 = new FestivalsEntity("Dewali", "Hindu", 2, "Paisa", "Devi");
		FestivalsEntity festivalsEntity5 = new FestivalsEntity("Sankaranti", "Hindu", 4, "Sweet", "Devi");
		FestivalsEntity festivalsEntity6 = new FestivalsEntity("Moharam", "Musliam", 4, "JaggryJuice", "Moharam");
		FestivalsEntity festivalsEntity7 = new FestivalsEntity("Janmashtami", "Hindu", 1, "sweet", "Krishna");
		FestivalsEntity festivalsEntity8 = new FestivalsEntity("Ram Navami", "Hindu", 1, "sweet", "Rama");
		FestivalsEntity festivalsEntity9 = new FestivalsEntity("Holi", "Hindu", 1, "sweet", "holi");
		FestivalsEntity festivalsEntity10 = new FestivalsEntity("Raksha Bandana", "Hindu", 1, "paak", "Brother/sister");
		FestivalsEntity festivalsEntity11 = new FestivalsEntity("Nag Panchami", "Hindu", 5, "milk", "Snake");
		FestivalsEntity festivalsEntity12 = new FestivalsEntity("Pongal", "Hindu", 2, "pongal", "god");
		FestivalsEntity festivalsEntity13 = new FestivalsEntity("Onam", "Hindu", 1, "pongal", "god");
		FestivalsEntity festivalsEntity14 = new FestivalsEntity("Christmas", "Christance", 3, "cake", "jesus");
		FestivalsEntity festivalsEntity15 = new FestivalsEntity("GoodFriday", "Christance", 3, "cake", "jesus");
		FestivalsEntity festivalsEntity16 = new FestivalsEntity("Jallikattu", "Hindu", 1, "sweet", "Nandhi");
		FestivalsEntity festivalsEntity17 = new FestivalsEntity("Eid UI", "Musliam", 1, "sweet", "Eid");
		FestivalsEntity festivalsEntity18 = new FestivalsEntity("Basant panchami", "Hindu", 7, "sweet", "snake");
		FestivalsEntity festivalsEntity19 = new FestivalsEntity("Mewar", "Hindu", 2, "sweet", "Me");
		FestivalsEntity festivalsEntity20 = new FestivalsEntity("Baisakhi", "Hindu", 2, "sweet", "God");
		FestivalsEntity festivalsEntity21 = new FestivalsEntity("Bonalu", "Hindu", 3, "sweet", "Devi");
		FestivalsEntity festivalsEntity22 = new FestivalsEntity("Ugadi", "Hindu", 3, "pongal", "God");
		FestivalsEntity festivalsEntity23 = new FestivalsEntity("Bathukamma", "Hindu", 3, "sweet", "Bathukamma");
		FestivalsEntity festivalsEntity24 = new FestivalsEntity("Marriage", "Hindu", 7, "AllSweets", "Omkar");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(festivalsEntity);
		transaction.commit();

		System.out.println(festivalsEntity);
		System.out.println(festivalsEntity1);
		System.out.println(festivalsEntity2);
		System.out.println(festivalsEntity3);
		System.out.println(festivalsEntity4);
		System.out.println(festivalsEntity5);
		System.out.println(festivalsEntity6);
		System.out.println(festivalsEntity7);
		System.out.println(festivalsEntity8);
		System.out.println(festivalsEntity9);
		System.out.println(festivalsEntity10);
		System.out.println(festivalsEntity11);
		System.out.println(festivalsEntity12);
		System.out.println(festivalsEntity13);
		System.out.println(festivalsEntity14);
		System.out.println(festivalsEntity15);
		System.out.println(festivalsEntity16);
		System.out.println(festivalsEntity17);
		System.out.println(festivalsEntity18);
		System.out.println(festivalsEntity19);
		System.out.println(festivalsEntity20);
		System.out.println(festivalsEntity21);
		System.out.println(festivalsEntity22);
		System.out.println(festivalsEntity23);
		System.out.println(festivalsEntity24);
		manager.close();
	}

}
