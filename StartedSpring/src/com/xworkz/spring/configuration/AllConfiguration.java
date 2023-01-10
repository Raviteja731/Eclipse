package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.Actor;
import com.xworkz.spring.Rocket;
import com.xworkz.spring.Season;

@Configuration
@ComponentScan("com.xworkz.spring")
public class AllConfiguration {

	@Bean
	public Rocket heroName()
	{
		Rocket rocket = new Rocket();
		return rocket;
	}
	
	@Bean
	public Actor heroLang()
	{
		Actor actor = new Actor("Surya","Telugu",54);
		return actor;
	}
	
	@Bean
	public Season heroAge()
	{
		Season seasons = new Season();
		seasons.setName("HogaKala");
		seasons.setDuration(4);
		seasons.setStartingMonth("June");
		return seasons;
	}
	
	
}
