package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapScenario {
	public static void main(String[] args) {
		
		Map<Integer,String> m = new LinkedHashMap<>();
		// To add the Values To the Map
		m.put(10, "Java");
		m.put(20, "Selenium");
		m.put(30, "Python");
		m.put(40, "C#");
		m.put(50, "Ruby");
		m.put(10, ".Net");
		m.put(60, "Python");
		
		System.out.println(m);
		
		//used to find out the size of map
		  
		int size = m.size();
		System.out.println(size);
		
		//displaying the corresponding keys values
		String string = m.get(20);
		System.out.println(string);
		
		//remove the values from map
		m.remove(40);
		System.out.println(m);
		
		//used to check the particular key is present or out
		boolean containsKey = m.containsKey(20);
		System.out.println(containsKey);		
		
		//used to check the particular value is present or out
		boolean containsValue = m.containsValue("Java");
		System.out.println(containsValue);
		
		//displaying the values only and its return type is collection
		Collection<String> values = m.values();
		System.out.println(values);		
		
		
		//display the keys  only and its return type is set.
				Set<Integer> keySet = m.keySet();
				System.out.println(keySet);
				
				// for iterating the map and its return type is set<Entry<>>
				Set<Entry<Integer, String>> entrySet = m.entrySet();
				System.out.println(entrySet);
				
				System.out.println("**ForEachLoop***");
				
				for (Entry<Integer, String> x : entrySet) {
					
					System.out.println(x);
					
				}
				
				System.out.println("**ForEachLoop***");
				
				for (Entry<Integer, String> y : entrySet) {
					
//					String value = y.getValue();
//					System.out.println(value);
					
					System.out.println(y.getKey());
					System.out.println(y.getValue());
					System.out.println("");
		
		
	}
}}
