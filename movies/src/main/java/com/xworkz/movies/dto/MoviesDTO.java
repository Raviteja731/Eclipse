package com.xworkz.movies.dto;

import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;

public class MoviesDTO {

	@NotNull
	@Size(min = 3, max = 15, message = "MovieName Should Be More Than 3 And less Than 15..!")
	private String movieName;
	@NotNull
	@Size(min = 3, max = 15, message = "HeroName Should Be More Than 3 And less Than 15..!")
	private String heroName;
	@NotNull
	@Size(min = 3, max = 15, message = "HeroinName Should Be More Than 3 And less Than 15..!")
	private String heroinName;
	@NotNull
	@Size(min = 3, max = 15, message = "Producer Should Be More Than 3 And less Than 15..!")
	private String producer;
	@NotNull
	private double budget;
	
	 public MoviesDTO() {
		System.out.println("Created MoviesDTO.."+getClass().getSimpleName());
	}
	public MoviesDTO(String movieName, String heroName, String heroinName, String producer, double budget) {
		super();
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroinName = heroinName;
		this.producer = producer;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "MoviesDTO [movieName=" + movieName + ", heroName=" + heroName + ", heroinName=" + heroinName
				+ ", producer=" + producer + ", budget=" + budget + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroinName() {
		return heroinName;
	}

	public void setHeroinName(String heroinName) {
		this.heroinName = heroinName;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	
}
