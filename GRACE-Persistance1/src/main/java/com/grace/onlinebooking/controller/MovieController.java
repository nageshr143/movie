package com.grace.onlinebooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.grace.onlinebooking.model.Movie;

import com.grace.onlinebooking.service.MovieService;


@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	//http://localhost:8084/allMovies
	@GetMapping(value="/allMovies")
		public Iterable<Movie>getAllUsers(){
		return movieService.findAllMovies();
	}
	
	 @GetMapping(value="/getMovieName")
	    public String getMovie(@RequestParam String movieId) {
	    	System.out.println("movieName::::::"+movieId);
	    	int number = Integer.parseInt(movieId);
	    	return movieService.getMovieNameById(number);
	  	}
	
	
	
	@PostMapping(value="/createMovie")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieService.createMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }
	
	
}
