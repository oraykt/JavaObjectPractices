package com.oraykurt.student;

public class Student {

	private static int ID = 1;
	private String studentId;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;

	public Student(String name, String ssn){
		ID++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setStudentId();

	}

	public void enroll(String course){
		this.courses += "\n" + course;
		this.balance -= costOfCourse;
	}

	public void payTuition(int amount){
		this.balance += amount;

	}

	public void checkBalance(){
		System.out.println("Balance: $" + balance);
	}

	public void showCourses(){
		System.out.println("Enrolled courses " + courses);
	}


	private void setEmail(){
		this.email = name.toLowerCase() + ID + "@student.university.com";
		System.out.println("Student email: " + email);
	}

	private void setStudentId(){
		int random = (int) (Math.random() * 10000);
		this.studentId = ID + "" + random + "" + ssn.substring(5);
		System.out.println("Your student id: " + studentId);

	}

	public String getEmail(){
		return email;
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentId='" + studentId + '\'' +
				", name='" + name + '\'' +
				", ssn='" + ssn + '\'' +
				", email='" + email + '\'' +
				", courses='" + courses + '\'' +
				", balance=" + balance +
				'}';
	}
}
