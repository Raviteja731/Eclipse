package com.xworkz.spring.configuration.boot;

import java.util.Arrays;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.Power;
import com.xworkz.spring.configuration.Bank;

public class BankRunner {

	public static void main(String[] args) {


		ApplicationContext app = new AnnotationConfigApplicationContext(Bank.class);
				String[] string = app.getBeanDefinitionNames();
				System.out.println(Arrays.toString(string));
				System.out.println(Bank.class);
				
		
	}

}
