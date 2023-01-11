package com.xworkz.spring.configuration.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.Actor;
import com.xworkz.spring.HardwareShop;
import com.xworkz.spring.MyBio;
import com.xworkz.spring.Pen;
import com.xworkz.spring.Pencil;
import com.xworkz.spring.Rocket;
import com.xworkz.spring.Rubber;
import com.xworkz.spring.Season;
import com.xworkz.spring.Software;
import com.xworkz.spring.SoftwareEnginer;
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
		
		String pen = container.getBean("go",String.class);
		System.out.println(pen);
		
		System.out.println("********************Next Move on Spring**************************");
		
		HardwareShop hard =	container.getBean(HardwareShop.class);
		System.out.println(hard.toString());
		System.out.println(hard.getName());
		System.out.println(hard.getAddress());
		System.out.println(hard.getGstno());
		System.out.println(hard.getId());
		System.out.println(hard.getOwnerName());
		
		System.out.println("-------------------------------");

		Software soft =	container.getBean(Software.class);
		System.out.println(soft.toString());
		System.out.println(soft.getName());
		System.out.println(soft.getDate());
		System.out.println(soft.getDeveloper());
		System.out.println(soft.getFree());
		System.out.println(soft.getVersion());
		
		System.out.println("-------------------------------");

		Rubber rubber =	container.getBean(Rubber.class);
		System.out.println(rubber.toString());
		System.out.println(rubber.getName());
		System.out.println(rubber.getColour());
		System.out.println(rubber.getPrice());
		System.out.println(rubber.getShape());
		System.out.println(rubber.getSize());
		System.out.println(rubber.getStolen());
		
		System.out.println("-------------------------------");

		Pencil pencil =	container.getBean(Pencil.class);
		System.out.println(pencil.toString());
		System.out.println(pencil.getName());
		System.out.println(pencil.getColour());
		System.out.println(pencil.getPrice());
		System.out.println(pencil.getSharp());
		System.out.println(pencil.getStolen());
		
		System.out.println("-------------------------------");

		SoftwareEnginer enginer =	container.getBean(SoftwareEnginer.class);
		System.out.println(enginer.toString());
		System.out.println(enginer.getName());
		System.out.println(enginer.getCompanyName());
		System.out.println(enginer.getExp());
		System.out.println(enginer.getSalary());
	
		System.out.println("-------------------------------");

		MyBio bio = container.getBean(MyBio.class);
		System.out.println(bio.toString());
		System.out.println(bio.getName());
		System.out.println(bio.getAge());
		System.out.println(bio.getHeight());
		System.out.println(bio.getWeight());
		System.out.println(bio.getSingle());
		System.out.println(bio.getCity());
		System.out.println(bio.getAlive());
		System.out.println(bio.getCompany());
		System.out.println(bio.getExp());
		System.out.println(bio.getMobileNo());
		



		
	}

}
