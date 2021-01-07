package com.oraykurt.Student;

public class StudentApp {

	public static void main (String[] args){
		Student student1 = new Student("Oray", "354226897");

		student1.enroll("EN113");
		student1.enroll("AAC112");
		student1.checkBalance();
		student1.payTuition(2400);
		student1.checkBalance();
		student1.showCourses();
		student1.enroll("AAD223");
		student1.checkBalance();
		student1.showCourses();


		System.out.println(student1.toString());
	}




}
