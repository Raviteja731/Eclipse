package com.xworkz.movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class MovieEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "movieName")
	private String movieName;
	@Column(name = "heroName")
	private String heroName;
	@Column(name = "heroinName")
	private String heroinName;
	@Column(name = "producer")
	private String producer;
	@Column(name = "budget")
	private double budget;
	
	public MovieEntity() {
		System.out.println("Created MovieEntity");
	}

	public MovieEntity(int id, String movieName, String heroName, String heroinName, String producer, double budget) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroinName = heroinName;
		this.producer = producer;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "MovieEntity [id=" + id + ", movieName=" + movieName + ", heroName=" + heroName + ", heroinName="
				+ heroinName + ", producer=" + producer + ", budget=" + budget + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
