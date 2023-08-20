package com.neotech.lesson12;

public class Task2 {

	public static void main(String[] args) {
		int[] numbers= {2,7,5,12,75,13};
		int size = numbers.length;
		int sum=0;
		for(int i=0; i<size; i++) {
			sum+=numbers[i];
		}
		System.out.println("sum of the all elements: "+sum);

	}

}
