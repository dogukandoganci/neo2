package com.neotech.lesson06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String name = input.next();
		System.out.println("Please enter your last name");
		String lastName = input.next();
		System.out.println("Your name is: "+name+ " "+lastName);
	}

}
