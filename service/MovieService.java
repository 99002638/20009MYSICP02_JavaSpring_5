package com.movie.service;

import java.util.List;

import com.movie.exception.MovieNotFoundException;

import com.movie.model.Movie;

public interface MovieService {
	
	
	
	 
		Movie addMovie(Movie movie);
	    boolean deleteMovie(Integer MovieRating) throws MovieNotFoundException;
	    List<Movie> getMovieByRating(Integer Movierating) throws MovieNotFoundException;
	    Movie updateMovie(Movie Movie);
	   
	    List<Movie> getAllMovies();
	    List<Movie> getMovieByActor(String actor) throws MovieNotFoundException;;
	    List<Movie> getMovieByActress(String actress)throws MovieNotFoundException;;
	    List<Movie> findByActorAndActress(String actor,String actress);
	    List<Movie> findMoviesByGenreAndRating(String genre,Integer rating);
	    List<Movie> findByGenre(String genre);
	  //  List<Movie> getMovieByActorAge(Integer age) throws MovieNotFoundException;;

	}

	





