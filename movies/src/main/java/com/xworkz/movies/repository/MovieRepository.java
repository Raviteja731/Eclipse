package com.xworkz.movies.repository;

import com.xworkz.movies.entity.MovieEntity;

public interface MovieRepository {

	boolean save (MovieEntity entity);
	
	MovieEntity findby(int id);
}
