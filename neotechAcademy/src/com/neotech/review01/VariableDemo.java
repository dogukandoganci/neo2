package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {
		
		String firstName = "Fulin";
		String lastName = "Cebe";
		int age = 25;
		System.out.println(firstName + " " + lastName + " "+ age + 1);
		System.out.println(firstName + " " + lastName + " "+ (age + 1));
		System.out.println(age);
		
		age = age + 10;
		lastName = "Pitt";
				
		System.out.println("After getting married!");
		System.out.println(firstName + " " + lastName + " "+ age);
	}

}
