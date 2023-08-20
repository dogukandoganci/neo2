package com.neotech.lesson13;

public class RetrievingValuesForEachLoop {

	public static void main(String[] args) {

			String[][] animals= {
					{"cat", "dog", "bird"},
					{"tiger", "lion", "bear"},
					{"salmon", "shrimp", "seabass"}
			};
			
			//how to get the number of rows
			int rows=animals.length;
			
			//how to get the number of columns for row 0
			int cols=animals[0].length;
			
			//how to get a specific item
			String lion=animals[1][1];
			//how to print all values using for loop
			for(int row=0; row<animals.length; row++)
			{
				for(int col=0; col<animals[row].length; col++) {
					System.out.print(animals[row][col]+" ");
				}
			}
			System.out.println();
			//easiest way
			System.out.println("Using for each");
			
			for (String[] row:animals)
			{
				//first iteration: {"cat", "dog", "bird"}
				for(String col:row){
					//cat
					//dog
					//bird
					System.out.print(col+" ");	
				}
			}
			
			
			//using for each in 2D array
			//first for loop: (1D array: 2D array)
			//second for loop: (String value: 1D array
			System.out.println();
			int[][] grades= {
					{95, 86, 88},
					{90, 95},
					{99, 89, 92, 93},
					{88, 85, 89}
			};
			
			for(int[] row : grades)
			{
				for(int col:row) 
				{
					System.out.print(col+" ");
				}
				System.out.println();
			}
			
			
			
			
			
	}

}
