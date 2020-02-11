package com.capgemini.airlinereservationsystem.exception;

public class InvalidOptionException extends RuntimeException {

	String msg ="Please Enter valid id ";

	public InvalidOptionException() {
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
	

}
	


