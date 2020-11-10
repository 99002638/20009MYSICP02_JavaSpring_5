
package com.movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.exception.MovieNotFoundException;

import com.movie.model.Movie;
import com.movie.service.MovieService;

@RestController
@RequestMapping("/movie-api")
public class MovieResponseController {
	@Autowired
	MovieService movieService;
	@PostMapping("/movies")
	 ResponseEntity<Movie> addMovie(@RequestBody Movie movie)
	 {
		Movie mov=movieService.addMovie(movie);
		return ResponseEntity.ok(mov);
	 }
	
	@DeleteMapping("/movies/delete-one/movieRating}")
	ResponseEntity<Boolean> deleteMovieByRating(@PathVariable("movieRating")Integer movieRating) {
		movieService.deleteMovie(movieRating);
		return ResponseEntity.status(HttpStatus.OK).build();

	}
	@GetMapping("/movies/get-one/{movieRating}")
	ResponseEntity<List<Movie>> getMovieByRating(@PathVariable("movieRating") Integer movieRating) throws MovieNotFoundException
	 {
		List<Movie> mov=movieService.getMovieByRating(movieRating);
		HttpHeaders header=new HttpHeaders();
		header.add("desc", "Getting movie by rating");
		header.add("title", "One Movie");
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(mov);
	 }
	
	 @GetMapping("/movies")
	 ResponseEntity<List<Movie>> getAllMovies()
	 {
		 List<Movie> movieList=movieService.getAllMovies();
		 return ResponseEntity.ok(movieList);
	 }
	@GetMapping("/movie/genre/{genre}")
	 ResponseEntity<List<Movie>> findByGenre(@PathVariable("genre")String genre) throws MovieNotFoundException{
	        List<Movie> movieList =   movieService.findByGenre(genre);
	        return ResponseEntity.ok(movieList);
	    }
	 @GetMapping("/movies/actor/{actor}")
	 ResponseEntity<List<Movie>> findByActor(@PathVariable("actor")String actor)throws MovieNotFoundException{
	        List<Movie> actorList = movieService.getMovieByActor(actor);    
	        return ResponseEntity.ok(actorList);
	    }
//	 @GetMapping("/movies/age/{age}")
//	 public ResponseEntity<List<Movie>> findByActorAge(@PathVariable("age")int age) {
//	        List<Movie> ageList = movieService.findByActorAge(age);
//	        return ResponseEntity.ok(ageList);
//	        
//	    }
//	 @GetMapping("/movies/actage/{actage}")
//	 public ResponseEntity<List<Movie>> findByActressAge(@PathVariable("actage")int actage) {
//	        List<Movie> ageList = movieService.findByActressAge(actage);
//	        return ResponseEntity.ok(ageList);
	        
	    }
	


