package com.neotech.lesson12;

public class Task4 {

	public static void main(String[] args) {
		int[] numbers= {23,56,-75,16,80,70,-40};
		
		int largest=numbers[0];
		
		for(int num: numbers) {
			if(num>largest)
			{
				largest=num;
			}
		}
		System.out.println(largest);
		
		//using indexed for loop
		int max= numbers[0];
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
		}
		
		System.out.println(max);
		
		
	}

}
