package com.dojo.exception;

//thrown when invalid jwt token is passed 
public class InvalidTokenException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTokenException(String message){
		super(message);
	}
}
