package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {
	/*
	 * Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. Using 2
	 * different ways retrieve all elements from set.
	 */
	public static void main(String[] args) {

		Set<String> counties = new TreeSet<>();
		counties.add("Canada");
		counties.add("Brazil");
		counties.add("Slovakia");
		counties.add("Norway");
		counties.add("Mexico");
		counties.add("Turkiye");

		System.out.println(counties);

		// for each loop
		for (String country : counties) {
			System.out.println(country);
		}

		System.out.println("----------------");
		// iterator
		Iterator<String> it = counties.iterator();
		while (it.hasNext()) {
			String country = it.next();
			System.out.println(country);
		}

		// for loop
		for (int i = 0; i < counties.size(); i++) {
			// String country = counties.get(i);//In Set, there is no index
		}

	}
}
