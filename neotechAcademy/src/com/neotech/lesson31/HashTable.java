package com.neotech.lesson31;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<>();
//		HashMap<Integer, String> hm=new HashMap<>();
		
		ht.put(2, "Yildirim");
		ht.put(3, "Ogulcan");
		ht.put(4, "Dogukan");
//		ht.put(5, null); //null values are not allowed
//		ht.put(null, "Can"); //null keys are not allowed
		
	}

}
