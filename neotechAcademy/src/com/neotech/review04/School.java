package com.neotech.review04;

public class School {

	public static void main(String[] args) {
		
		
		Student student1=new Student();
		student1.name="Dogukan";
		student1.studentNr=166;
		student1.gradeLevel=12;
		
		Student student2=new Student();
		student2.gradeLevel=9;
		student2.studentNr=452;
		student2.name="Donald";
	
		
		Teacher teacher1=new Teacher();
		teacher1.name="Sabah";
		teacher1.salary=120000;
		teacher1.subject="Java";
		
		//re-assigning subject
		teacher1.subject="Selenium";
		
		System.out.println("Lets call the methods!");
		
		student2.study();
		student2.sleep();
		student1.study();
		student1.sleep();
		
		teacher1.teach();
		teacher1.yellAtStudent();
	}

}
