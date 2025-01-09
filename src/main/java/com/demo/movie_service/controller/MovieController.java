package com.demo.movie_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.movie_service.dao.entity.MovieEntity;
import com.demo.movie_service.service.MovieService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	@GetMapping("/movies")
	public ResponseEntity<List<MovieEntity>> getAllMovies()
	{
		return new ResponseEntity<List<MovieEntity>>(movieService.getAllMovies(), HttpStatus.OK);
	}
	@GetMapping("/movies/{movieId}")
	public ResponseEntity<Optional<MovieEntity>> getAMovie(@PathVariable int movieId){
		
		return new ResponseEntity<Optional<MovieEntity>>(movieService.getAMovie(movieId),HttpStatus.OK);
	}
	@PostMapping("/movies")
	public ResponseEntity<MovieEntity> addMovie(@RequestBody @Valid MovieEntity newMovie)
	{
		return new ResponseEntity<MovieEntity>(movieService.addMovie(newMovie),HttpStatus.OK);
	}
	@PutMapping("/movies")
	public ResponseEntity<MovieEntity> updateMovie(@RequestBody @Valid MovieEntity editMovie)
	{
		return new ResponseEntity<MovieEntity>(movieService.updateMovie(editMovie),HttpStatus.OK);
	}
	
	@DeleteMapping("/movies/{movieId}")
	public ResponseEntity<Void> deleteMovie(@PathVariable int movieId) {
		movieService.deleteMovie(movieId);
		return new ResponseEntity(HttpStatus.OK);
	}

}
