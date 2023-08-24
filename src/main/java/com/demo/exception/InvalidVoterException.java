package com.demo.exception;

public class InvalidVoterException extends RuntimeException {

	private static final long serialVersionUID = 1L; // for best practices

	public InvalidVoterException(String message) {
		super(message);
	}
	
	

}
