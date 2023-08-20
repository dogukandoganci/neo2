package com.neotech.review07;

public class Student {
	//instance variables
	String name;
	int age;
	
	//static/class variables
	static String school;
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void displayStudentInfo() {
		System.out.println("My name is "+this.name+" AND my age is "+this.age+
				" AND my school is "+Student.school);
	}
	
	
	public static void main(String[] args) {
		Student.school="Neotech";
		
		// we don't have the default constructor
		//Student s1=new Student();
		
		Student s2=new Student("Gorkem",25);
		s2.displayStudentInfo();
		
		Student s3=new Student("Emine",18);
		s3.displayStudentInfo();
		
	}
	
}
