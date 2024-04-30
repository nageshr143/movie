package com.grace.onlinebooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grace.onlinebooking.dao.MovieDAO;

import com.grace.onlinebooking.model.Movie;

@Service
public class MovieService {
	@Autowired
	private MovieDAO moviedao;

	public Iterable<Movie> findAllMovies() {
		return moviedao.findAll();
	}

	
	public Movie createMovie(Movie movieObj) {
		return moviedao.save(movieObj);
	}


	public String getMovieNameById(int movieId) {
        // Implement logic to retrieve movie name by movieId from the repository
		
		System.out.println(" Entered  the service layer"+movieId);
		Movie movie = moviedao.getById(movieId);
		System.out.println(" Entered  the service layer"+movie.getMname());
        return (movie != null) ? movie.getMname() : null;
    }
	

}
