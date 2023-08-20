package com.neotech.lesson13;

public class Task1 {

	public static void main(String[] args) {
		// Create a 2D array of integer type with 3 rows and 4 columns and 
		//print all values of the whole array.
		
		int[][] numbers= {
				{88, 78, 66},
				{54, 89, 23, 98},
				{34, 99, 72, 29}
		};
		
		for(int[] row:numbers) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		//Create a 2D array of integer type where you will 
		//store odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		
		for(int[] row:numbers) {
			for(int col:row) {
				if(col%2==0) {
					System.out.print(col+" ");
				}else {
					continue;
				}
			}
			System.out.println();
		}
		
		
		
	}

}
