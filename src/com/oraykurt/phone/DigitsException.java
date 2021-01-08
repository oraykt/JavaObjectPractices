package com.oraykurt.phone;

public class DigitsException extends Exception{

	private static final String message = "Phone number is not 12 digits!";


	public String toString(){
		return message;
	}

}
