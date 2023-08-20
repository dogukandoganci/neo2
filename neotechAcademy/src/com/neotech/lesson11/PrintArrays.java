package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {
		int[] points= {90,85,95,75,93,95,100};
		
		//printing one by one
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		
		int size=points.length;
		
		for(int i=0;i<size;i++) {
			System.out.print (points[i]+" ");
			
			//how can i find the sum of all points?
			
			int sum=0;
			for(i=0;i<size;i++){
				sum +=points[i];
			}
			
			System.out.println();
			System.out.println("The sum is: "+sum);
			
			//what about the average
			
			System.out.println("The average is "+sum/size);
			
			
		}
		
		
	}

}
