package com.movie.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.movie.model.Movie;





	
	@Repository
	public interface MovieRepository extends MongoRepository<Movie,String>
	{
		//derived query
		 List<Movie> findByRating(Integer movieRating);

	 List<Movie> findByActor(String actor);
	 List<Movie> findByActress(String actress);
	 List<Movie> findByGenre(String genre);

	 boolean deleteByRating(Integer movieRating);
	 //List<Movie> findByCategoryOrderByTitleAsc(String category);
	 List<Movie> findByActorAndActress(String actor,String actress);
	 
	 //jpql
	 @Query("From Movie b where b.genre=?1 and b.rating>?2")
	 List<Movie> findByGenreAndRating(String genre,Integer rating);
	}
	