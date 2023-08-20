package com.neotech.review10;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {
	//Map
	//HashMap | linkedHashMap | TreeMap | HashTable
	
	public static void main(String[] args) {
		
		Map<Integer, String> phoneBook=new HashMap<>();
		phoneBook.put(123456789, "John Smith");
		phoneBook.put(234567890, "Julia Roberts");
		phoneBook.put(345678901, "Donald Trump");
		phoneBook.put(111111111, "Obama");
		phoneBook.put(678901234, "Brad Pitt");
		phoneBook.put(409384756, "John Smith");
		
		//It will replace Julia Roberts with Emre
		phoneBook.replace(234567890,"Emre");
		
		//phoneBook.put(99999, "Emre");
		//if the number is the same it will do replace but if it's different it will
		//add another one to new number key
		
		System.out.println(phoneBook);
		
		//Map is one-directional, from key to value
		//There is NO way to go from the value to the key
		
		String name=phoneBook.get(234567890);
		System.out.println(name+" is calling...");
		
		name=phoneBook.get(9999);
		System.out.println(name+" is calling...");
		
		boolean containsK=phoneBook.containsKey(9999);
		System.out.println("9999 is in map -> "+containsK);
		
		boolean containsV=phoneBook.containsValue("Julia Roberts");
		System.out.println("Julia Roberts is in my contact list ->"+containsV);
		
		phoneBook.remove(345678901); //will remove the pair/entry from my map
		System.out.println(phoneBook);
		
		System.out.println("The size of my phonebook is -> "+ phoneBook.size());
		
		System.out.println("----phoneBook.keySet()----");
		
		//Let's get all the keys and store them in a SET
		Set<Integer> numbers=phoneBook.keySet();
		System.out.println(numbers);
		
		Iterator<Integer> itNums=numbers.iterator();
		while(itNums.hasNext()) {
			Integer number=itNums.next();
			
			//Find the name/value by using the number/key
			String personName=phoneBook.get(number);
			System.out.println(number+" -> "+personName);
		}
		
		//Let's get all the values store them in a COLLECTION
		System.out.println("----phoneBook.values()----");
		
		Collection<String> names=phoneBook.values();
		System.out.println(names);
		
		for(String element:names) {
			System.out.print(element+" ");
			
			
			// from the value we CANNOT find the key
			// phoneBook.get(element);
		}
		System.out.println();
		
		// TASK
		// Get the Entries from the Map
		// Iterate them using Enhanced for loop
		// Iterate them using Iterator
		
		Set<Entry<Integer, String>> entries=phoneBook.entrySet();
		System.out.println(entries);
		System.out.println(phoneBook);
		
		Iterator<Entry<Integer, String>> it=entries.iterator();
		
		while(it.hasNext()) {
			 Entry<Integer,String> entry=it.next();
			 System.out.print(entry+" ");
		}
		System.out.println();
		
		for(Entry<Integer, String> x:entries) {
			//System.out.print(x+" ");
			
			Integer key=x.getKey();
			String value=x.getValue();
			
			System.out.println(key+" -> "+value);
		}
		
		
		
	}
}
