package com.demo.movie_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.movie_service.dao.MovieDao;
import com.demo.movie_service.dao.entity.MovieEntity;

@Service
public class MovieService {
	
	@Autowired
	MovieDao movieDao;
	
	public List<MovieEntity> getAllMovies()
	{
		return movieDao.findAll();
	}
	public Optional<MovieEntity> getAMovie(int movieId){
		
		return movieDao.findById(movieId);
	}
	public MovieEntity addMovie(MovieEntity newMovie)
	{
		return movieDao.saveAndFlush(newMovie);
	}
	public MovieEntity updateMovie(MovieEntity editMovie)
	{
		return movieDao.save(editMovie);
	}
	
	
	public void deleteMovie(int movieId) {
		movieDao.deleteById(movieId);
	}
	
	

}
