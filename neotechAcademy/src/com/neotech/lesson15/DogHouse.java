package com.neotech.lesson15;

public class DogHouse {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="Bulut";
		d1.breed="Pekingese";
		d1.hairColor="Yellow";
		d1.size="small";
		d1.age=8;
		d1.poopsADay=2;
		
		d1.plays();
		d1.poops();
		
		System.out.println(d1.name+" has "+d1.hairColor+" hair and "+d1.age+" years old.");
		
		Dog d2=new Dog();
		d2.name="Viski";
		d2.breed="Golden Retriever";
		d2.hairColor="Yellow";
		d2.size="large";
		d2.age=11;
		d2.poopsADay=3;
		
		d2.plays();
		d2.poops();
		
		System.out.println(d2.name+" has "+d2.hairColor+" hair and "+d2.age+" years old.");
		
		Dog d3=new Dog();
		d3.name="Mark";
		d3.breed="Doberman";
		d3.hairColor="Black";
		d3.size="large";
		d3.age=4;
		d3.poopsADay=3;
		
		d3.plays();
		d3.poops();
		
		System.out.println(d3.name+" has "+d3.hairColor+" hair and "+d3.age+" years old.");

	}

}
