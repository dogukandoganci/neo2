package com.neotech.review08_Abstraction;

public class World {
	
	public static void main(String[] args) {
		//I can not create an object from an abstract class
		//Human h1=new Human("Olga");
		
		//up-casting and down-casting
		//can ONLY be done because of INHERITANCE
		Human a1=new Albanian("Alban"); //up-casting
		a1.talk();
		a1.sleep();
		//a1.albanianDance(); // Because albanianDance() method not declared in Human class
		
		Human t1=new Turkish("Mesut"); //up-casting
		t1.talk();
		t1.sleep();
		// t1.makeBaklava();
		
		Turkish tur=(Turkish) t1; //down - casting
		tur.makeBaklava();
		
		//TASK
		//
		
		Human[] WorldArray= { new Albanian("Sabah"),
				new Turkish("Ahmet"),new Albanian("Elion"),
				new Turkish("Joel"), new Turkish("Kerem")
		};
		
		for(Human h: WorldArray) {
			h.talk();
			h.sleep();
			
		}
		
	}
}
