package com.oraykurt.phone;

import java.io.*;
import java.lang.invoke.WrongMethodTypeException;

public class ReadPhone {

	private String fileName;


	ReadPhone(String fileName){
		this.fileName = fileName;

	}

	@Override
	public String toString(){
		String phoneNum = null;
		File file = new File(fileName);
		try {

			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNum = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			try {
				new WritePhone(fileName, file);
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
			phoneNum = new ReadPhone(fileName).toString();
			return phoneNum;
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file!");
		}
		return phoneNum;
	}

}
