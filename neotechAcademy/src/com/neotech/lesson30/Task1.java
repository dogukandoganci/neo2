package com.neotech.lesson30;

import java.util.HashMap;
import java.util.Map;


public class Task1 {
	/*
	 * Create a map of a building. Store floor number and it is associated company
	 * name. (Example: 1=Google, 2=Apple, 3=Neotech etc..). Insert 7 entries with
	 * duplicate keys and values. - Check how many entries you have? - Update
	 * company on a 4th floor - Remove company on the 7th floor - Print your map
	 */
	public static void main(String[] args) {

		Map<Integer, String> building = new HashMap<>();

		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "Neotech");
		building.put(4, "Microsoft");
		building.put(2, "Yahoo");
		building.put(6, "Neotech");
		building.put(5, "Yahoo");

		System.out.println(building);

		// how many entries do i have?
		System.out.println("We have " + building.size() + " entries!");

		// update the company with key 5
		building.replace(5, "Dell");
		// building.put(5, "Dell");

		System.out.println(building);

		// no error, nothing happens
		building.replace(7, "Meta");
		System.out.println(building);

		// remove company on floor number 6
		building.remove(6);
		System.out.println(building);

		building.put(4, "IBM");
		building.put(4, "HP");
		System.out.println(building);

		building.remove(7);

		building.replace(7, "Oracle");
		System.out.println(building);

		if (building.containsKey(7)) {
			building.replace(7, "Oracle");
		} else {
			System.out.println("nothing on floor 7");
		}

	}

}
