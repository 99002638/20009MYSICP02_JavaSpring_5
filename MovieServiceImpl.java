package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.MovieRepository;
import com.movie.exception.MovieNotFoundException;
import com.movie.model.Movie;

//import com.movie.dao.MovieRepository;
//import com.movie.exception.MovieNotFoundException;
//import com.movie.model.Movie;



@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
      MovieRepository movieRepository;
	
	
	
	
	public MovieServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Movie addMovie(Movie Movie) {
		Movie newMovie = movieRepository.save(Movie);
		return newMovie;
	}


	@Override
	public Movie updateMovie(Movie Movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public List<Movie> findByActorAndActress(String actor,String actress) {
		List<Movie> movielist = movieRepository.findByActorAndActress(actor,actress);
		if( movieRepository.findByActorAndActress(actor,actress).isEmpty()) {
			throw new MovieNotFoundException("movie actor and actress not available");
		}
		return movielist;
	}

	@Override
	public List<Movie> findMoviesByGenreAndRating(String genre, Integer rating) {
		List<Movie> movielist = movieRepository.findByGenreAndRating(genre,rating);
		if( movieRepository.findByGenreAndRating(genre,rating).isEmpty()) {
			throw new MovieNotFoundException("movie genre and rating not available");
		}
		return movielist;
	}

	@Override
	public boolean deleteMovie(Integer movieRating) throws MovieNotFoundException {
		movieRepository.deleteByRating(movieRating);
		return true;
	}
	@Override
	public List<Movie> getMovieByRating(Integer movieRating) throws MovieNotFoundException {
		return ( movieRepository.findByRating(movieRating));
		//.orElseThrow(()-> new MovieNotFoundException("Movie with this rating is not Available!!"));
		
	}


	@Override
	public List<Movie> getMovieByActor(String actor) throws MovieNotFoundException {
		// TODO Auto-generated method stub
		List<Movie> movielist = movieRepository.findByActor(actor);
		if( movieRepository.findByActor(actor).isEmpty()) {
			throw new MovieNotFoundException("actor not available");
		}
		return movielist;
	}

	@Override
	public List<Movie> getMovieByActress(String actress) throws MovieNotFoundException {
		List<Movie> movielist = movieRepository.findByActress(actress);
		if( movieRepository.findByActress(actress).isEmpty()) {
			throw new MovieNotFoundException("actress not available");
		}
		return movielist;
	}


	@Override
	public List<Movie> findByGenre(String genre) throws MovieNotFoundException {
		List<Movie> movielist = movieRepository.findByGenre(genre);
		if( movieRepository.findByGenre(genre).isEmpty()) {
			throw new MovieNotFoundException("genre not available");
		}
		return movielist;
	}


	

}
