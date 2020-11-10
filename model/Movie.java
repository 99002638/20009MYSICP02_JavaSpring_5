package com.movie.model;

import org.springframework.data.annotation.Id;

public class Movie {
	
	
	@Id
	Integer rating;
	String title;
	String genre;
	String actor;
	String actress;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(Integer rating, String title, String genre,String actor, String actress) {
		super();
		this.rating = rating;
		this.title = title;
		this.genre = genre;
		this.actor = actor;
		this.actress = actress;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", title=" + title + ", genre=" + genre + ", actor=" + actor + ", actress="
				+ actress + "]";
	}
	
}