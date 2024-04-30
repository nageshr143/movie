package com.grace.onlinebooking.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.grace.onlinebooking.model.Movie;


@Repository//DB connection
public interface MovieDAO extends JpaRepository<Movie, Integer> {

	
	
		
}

    
