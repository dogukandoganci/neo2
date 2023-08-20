package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task1 {
	public static void main(String[] args) {
		
		String[] cities= {"London", "Ankara", "Paris", "Washington DC", "Rome"};
		
		Map<String, Integer> map=new TreeMap<>();
		
		for(String str: cities) {
			map.put(str, str.length());
		}
		
		
		//remove cities with length more than 7
		//NOTE: how does iterator work:
			// Iterator<Object Type> name=collectionName.iterator();
		
		
										//  map.entrySet() -- this is a Set
		Iterator<Entry<String, Integer>> it=map.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String, Integer> entry=it.next();
			if(entry.getValue()>7) {
				it.remove();
			}
		}
		System.out.println(map);
		
		for(Entry<String, Integer> entry: map.entrySet()) {
			
			//we can also get the values first, and the create the condition
			String key=entry.getKey();
			int value=entry.getValue();
			if (value > 7)
			{
				map.remove(key);
			}
			
		}
		
		
		
	}
}
