package com.xworkz.spring.configuration.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.Actor;
import com.xworkz.spring.Rocket;
import com.xworkz.spring.Season;
import com.xworkz.spring.configuration.AllConfiguration;

public class HeroRunner {

	public static void main(String[] args) {


		ApplicationContext container = new AnnotationConfigApplicationContext(AllConfiguration.class);

		System.out.println("-------------------------------");

		Rocket actor = container.getBean("Lucky",Rocket.class);
		System.out.println(actor.toString());
		System.out.println(actor.getName());
		System.out.println(actor.getCountry());
		System.out.println(actor.getBudget());
		
		System.out.println("-------------------------------");

		Rocket actor1 = container.getBean("heroName",Rocket.class);
		System.out.println(actor1.toString());

		System.out.println(actor1.getName());
		System.out.println(actor1.getCountry());
		System.out.println(actor1.getBudget());
		
		System.out.println("*************************");
		Actor rocket = container.getBean("ram",Actor.class);
		System.out.println(rocket.toString());

		System.out.println(rocket.getName());
		System.out.println(rocket.getAge());
		System.out.println(rocket.getLang());
		
		System.out.println("-------------------------------");
		Actor rocket1 = container.getBean("heroLang",Actor.class);
		System.out.println(rocket1.toString());

		System.out.println(rocket1.getName());
		System.out.println(rocket1.getAge());
		System.out.println(rocket1.getLang());
		
		System.out.println("*************************");

		Season season = container.getBean("surya",Season.class);
		System.out.println(season.toString());

		System.out.println(season.getName());
		System.out.println(season.getDuration());
		System.out.println(season.getStartingMonth());
		
		System.out.println("-------------------------------");

		Season season1 = container.getBean("heroAge",Season.class);
		System.out.println(season1.toString());

		System.out.println(season1.getName());
		System.out.println(season1.getDuration());
		System.out.println(season1.getStartingMonth());
		
		
		
	}

}
