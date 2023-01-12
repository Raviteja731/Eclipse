package com.xworkz.spring.boot;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.Engine;
import com.xworkz.spring.Ghost;
import com.xworkz.spring.NewsPaper;
import com.xworkz.spring.Snake;
import com.xworkz.spring.configuration.AllConfiguration;

public class AllRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AllConfiguration.class);

		NewsPaper east = container.getBean(NewsPaper.class);

		System.out.println("PaperId : " + east.getId());
		System.out.println("Paper Lang : " + east.getLang());
		System.out.println("Paper name : " + east.getName());
		System.out.println("OwnerName : " + east.getOwnerName());
		System.out.println("Price : " + east.getPrice());

		System.out.println("-------------------------------------------");
		
		Engine engine = container.getBean(Engine.class);

		System.out.println("Engine Company : " + engine.getCompany());
		System.out.println("Engine Name : " + engine.getName());
		System.out.println("Engine Number : " + engine.getNumber());
		System.out.println("Engine Stroke : " + engine.getStrokes());
		System.out.println("Engine Type : " + engine.getType());
		System.out.println("Engine Version : " + engine.getVersion());

		System.out.println("-------------------------------------------");
		
		Snake snake = container.getBean(Snake.class);

		System.out.println("Snake NAme : " + snake.getName());
		System.out.println("Snake colour : " + snake.getColour());
		System.out.println("Snake Length : " + snake.getLength());
		System.out.println("Snake type : " + snake.getType());

		System.out.println("-------------------------------------------");

		Ghost ghost = container.getBean(Ghost.class);
		System.out.println(ghost.toString());
		System.out.println("Father Name : "+ghost.getFatherName());
		System.out.println("Mother NAme : "+ghost.getMotherName());
		System.out.println("Ghost Name : "+ghost.getName());
		System.out.println("Age : "+ghost.getAge());
		System.out.println("Birth Year : "+ghost.getBirthYear());
		System.out.println("Death Year : "+ghost.getDeathyear());
		System.out.println("City : "+ghost.getCity());
		System.out.println("Colour : "+ghost.getColour());
		System.out.println("Education : "+ghost.getEducation());
		System.out.println("Ex Name : "+ghost.getExName());
		System.out.println("Genger : "+ghost.getGender());
		System.out.println("Hair Colour : "+ghost.getHairColour());
		System.out.println("Height : "+ghost.getHeight());
		System.out.println("Mobile No : "+ghost.getMobileNo());
		System.out.println("Nationality : "+ghost.getNationality());
		System.out.println("Reason : "+ghost.getReason());
		System.out.println("Weight : "+ghost.getWeight());
		System.out.println("Hudugi Super : "+ghost.getHudugiSuper());
		System.out.println("Single : "+ghost.getSingle());
		System.out.println("Alive : "+ghost.getAlive());
		
	}

}
