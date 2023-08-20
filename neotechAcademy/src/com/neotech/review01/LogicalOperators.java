package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperators {
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		
		String result = "";
		if (age >=1 && age<= 3) {
			result = "baby";
		}
		else if (age ==4 || age == 5) { // using OR better for individual values
			result = "toddler";
		}
		else if (age >= 6 && age <= 12) {
			result = "kid";
		}
		else if (age>=13 && age<=20) {
			result = "teenager";
		}
		else if (age >= 20) {
			result = "adult";
		}
		else {
			result = "alien";
		}
		
		System.out.println("You are a/an "+ result);
		

	}

}
