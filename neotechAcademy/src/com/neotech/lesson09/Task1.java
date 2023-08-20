package com.neotech.lesson09;

public class Task1 {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space
		// Print numbers from 100 to 1
		// Print even numbers from 20 to 1 (2 ways)
		// Print odd numbers between 20 and 50 (2 ways)

		for(int i=1; i<=100; i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i2= 100; i2>=1; i2--)
		{
			System.out.print(i2+" ");
		}
		System.out.println();
		for(int i3=20; i3>=1; i3-=2)
		{
			System.out.print(i3+" ");
		}
		System.out.println();
		System.out.println("second way");
		for(int i3=20; i3>=1; i3--)
		{
			if(i3%2==0) {
				System.out.print(i3 + " ");
			}
		}
		System.out.println();
		for (int i4=21; i4<=49; i4+=2)
		{
			System.out.print(i4+" ");
		}
		System.out.println();
		System.out.println("second way");
		for (int i4=21; i4<=49; i4++)
		{
			if(i4%2==1) {
				System.out.print(i4+" ");
			}
		}
		
		
		
		
	}

}
