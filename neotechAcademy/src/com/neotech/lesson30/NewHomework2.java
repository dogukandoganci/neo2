package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NewHomework2 {
	/*
	 * Create a map of countries with its capital that will store countries in
	 * alphabetical order. Add them randomly in the map. Example: "France" ->
	 * "Paris" "Kosovo" -> "Prishtina" "Turkey" -> "Ankara" "USA" -> "Washington DC"
	 * "Albania" -> "Tirana" "Italy" -> "Rome"
	 * 
	 * - Print the list and check the order of the countries. - Verify if you have
	 * your contry (Albania, Turkey) in the list ( use containsKey() method ) -
	 * Verify if a specific capital city is in the list ( use containsValue() method
	 * ) - Get all the keys (countries names) in a Set. Print all country names
	 * using for each loop. - Get all the values (capital names) in a Collection.
	 * Print all capital names using iterator.
	 */
	
	public static void main(String[] args) {
		
		Map<String, String> countries=new TreeMap<>();
		countries.put("France","Paris");
		countries.put("Kosova","Prishtina");
		countries.put("Turkey","Ankara");
		countries.put("Usa","Washington DC");
		countries.put("Albania","Tirana");
		countries.put("Italy","Rome");
		
		
		boolean alban=countries.containsKey("Albania");
		System.out.println("Does your list contain Albania? "+alban);
		
		boolean turkish=countries.containsKey("Turkey");
		System.out.println("Does your list contain Turkey? "+turkish);
		
		boolean paris=countries.containsValue("Paris");
		System.out.println("Does your list contain Paris? "+paris);
		
		Set<String> keys=countries.keySet();
		System.out.println(keys);
		
		for(String city:keys) {
			System.out.print(city+" ");
		}
		System.out.println();
		
		
		Collection<String> capital=countries.values();
		System.out.println(capital);
		
		Iterator<String> it=capital.iterator();
		while(it.hasNext()) {
			String cap=it.next();
			System.out.print(cap+" ");
		}
		
		
		
	}
	
	
	
	
	
	
}
