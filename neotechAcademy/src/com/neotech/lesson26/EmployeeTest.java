package com.neotech.lesson26;

public class EmployeeTest {
		
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		//I can not access it
		//System.out.println(emp.name);
		
		System.out.println(emp.getName());
		
		//I can not change it
		//emp.name="Aysel";
		
		emp.setName("Aysel");
		
	}
}
