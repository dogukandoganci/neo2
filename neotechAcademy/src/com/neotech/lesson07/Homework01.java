package com.neotech.lesson07;

import java.util.Scanner;


public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*
			 * 1. Ask the user to enter the height in inches. 
			 * Person should be classified as one of the following: 
			 * • short (under 60 inch) 
			 * • medium (between 60 -72 inch)
			 * • tall (over 72 inch)
			 */	
			
			//I need a height variable
			int height;
			//I need a Scanner to get a value from the user
			Scanner scan = new Scanner(System.in);
			System.out.println("What is your height in inches?");
			height = scan.nextInt();
			
			//based on the height--> use if else to print specific statements
			
			//if height >0 and height <60    ]0, 60[
			if (height >0 && height < 60) //if we say <60, what if the user enters -10
			{
				System.out.println("Classified as \"Short\"!"); //print "Short"
			}
			else if (height >= 60 && height <= 72) //[60, 72]
			{
				System.out.println("Classified as \"Medium\"!");
			}
			else if (height > 72) //]72 - infinity
			{
				System.out.println("Classified as \"Tall\"!");
			}
			else
			{
				System.out.println("Invalid Input!");
			}
			
		
	}

}
