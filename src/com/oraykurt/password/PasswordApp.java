package com.oraykurt.password;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PasswordApp {

	private static final String strRegEx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,15}$";
	/*
	^ - start of the string
	(?=.*[0-9]) - Positive look ahead expression for any number
	(?=.*[a-z]) - Positive look ahead expression for lower case letter
	(?=.*[A-Z]) - Positive look ahead expression for upper case letter
	(?=.*[!@#$%^&*]) - Positive look ahead expression for any special character
	(?=\\S+$) - Positive look ahead expression for \S (non-space character)
	. – any character
	{8,15} - minimum 8, maximum 15 characters in length
	$ - end of the string
	 */

	/*
	private static final String strRegEx = "^(?=.*[0-9]).{8, }$";

	^ - start of the string
	(?=.*[0-9]) – Positive look ahead expression for any number
	. – any character
	{8,} - minimum 8 characters in length
	$ - end of the string
	 */

	public static void main (String[] args){

		String password = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Password criteria :");
		System.out.println("1)\tPassword must contain at least 8 characters");
		System.out.println("2)\tPassword must contain at least 1 number");
		System.out.println("3)\tPassword must contain at least 1 upper case letter");
		System.out.println("4)\tPassword must contain at least 1 lower case letter");
		System.out.println("5)\tPassword must contain at least 1 special character \'!@#$%^&*\'");
		System.out.println("6)\tPassword must not contain any spaces");
		System.out.println("Please type a password (\'q\' for exit): ");
		do{
			try {
				password = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(password.matches(strRegEx)){
				System.out.println("Password is valid!");
			}else{
				System.out.println("Password is not valid!");
			}
		}while(!password.matches(strRegEx) || password.equals("q"));


	}

}
