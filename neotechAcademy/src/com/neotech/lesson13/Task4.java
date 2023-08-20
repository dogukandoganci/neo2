package com.neotech.lesson13;

public class Task4 {

	public static void main(String[] args) {
//		Create an array (2D) of cars : American (2 - 3 cars), 
//		German (2-3 cars), Korean (1-2 cars), Italian (1-2 cars). 
//		Then retrieve all values from that array using 2 different 
//		loops
		
		String[][] cars = {
				{"Ford", "Tesla", "Dodge"},
				{"MB", "BMW", "Audi", "WV"},
				{"Kia", "Nissan"},
				{"Fiat", "Lambo", "Ferrari"}
		};
		
		
		
		//using indexed for loop
		
		for (int row = 0; row < cars.length; row++) 
		{
			for (int col = 0; col < cars[row].length; col++)
			{
				System.out.print(cars[row][col] + " ");
			}
		}
	System.out.println();
		
		//using for each 
		for (String[] row : cars)
		{
			for (String car : row)
			{
				System.out.print(car + " ");
			}
		}
				System.out.println();
		
		
		//what if we want to print only American cars	

		for (int us = 0 ; us < cars[0].length; us++)
		{
			System.out.print(cars[0][us] + " ");
		}

	}

}
