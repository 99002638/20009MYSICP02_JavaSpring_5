package com.movie.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class APIErrors {

	String message;
	LocalDateTime timestamp;
	HttpStatus staus;
	List<String> details;
	public APIErrors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public APIErrors(String message, LocalDateTime timestamp, HttpStatus staus, List<String> details) {
		super();
		this.message = message;
		this.timestamp = timestamp;
		this.staus = staus;
		this.details = details;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public HttpStatus getStaus() {
		return staus;
	}
	public void setStaus(HttpStatus staus) {
		this.staus = staus;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "APIErrors [message=" + message + ", timestamp=" + timestamp + ", staus=" + staus + ", details="
				+ details + "]";
	}
	
	
}
