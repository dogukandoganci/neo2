package com.neotech.lesson10;

public class SevvalTask {

	public static void main(String[] args) {
		/* 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 666666
		 * 7777777
		 * 666666
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1  
		 */
		
		for(int x=1; x<8; x++) {
			for(int y=1; y<x; y++) {
				System.out.print(x);
			}System.out.println();
		}
		
		

	}

}
