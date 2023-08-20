package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = input.next();
		System.out.println("Your name is: "+ name);
		
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		System.out.println("Your age: "+ age);
		
		
		System.out.println("Please enter your salary: ");
		double salary = input.nextDouble();
		System.out.println("Your salary: "+ salary);
		
		System.out.println("Is it raining??");
		boolean raining = input.nextBoolean();
		
		if(raining) {
			System.out.println("Bring an umbrella!!");
		}
		else {
			System.out.println("Come as you wish!!");
		}
	}

}
