package com.oraykurt.phone;

import java.awt.geom.Area;
import java.io.*;

public class PhoneApp {

	public static void main(String[] args) {

			String fileName = "Phone.txt";

			String phoneNum = new ReadPhone(fileName).toString();


			if(phoneNum.length() != 12){
				try {
					throw new DigitsException();
				} catch (DigitsException e) {
					System.out.println("ERROR: " +e.toString());
				}
			}else{
				System.out.println(phoneNum);
			}

	}
}
