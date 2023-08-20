package com.neotech.review03;

public class Pyramid {

	public static void main(String[] args) {
		for(int row=1; row<=4; row++) {
			for(int col=1; col<=row; col++) {   //col<=4 olsaydı hepsi aynı satır olurdu.
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
