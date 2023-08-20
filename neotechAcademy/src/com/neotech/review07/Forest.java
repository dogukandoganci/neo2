package com.neotech.review07;

public class Forest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wolf w1=new Wolf("North",4);
		w1.displayInfo();
		w1.sleeps();
		
		
		Fox f1=new Fox("Foxy",4,"Orange");
		f1.displayInfo();
		f1.sleeps();
		
		Bear b1=new Bear("Honey",4);
		b1.displayInfo();
		b1.roar();
	}

}
