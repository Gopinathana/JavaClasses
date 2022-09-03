package org.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CrtMap {
public static void main(String[] args) {
	
	int a=9/0;
	System.out.println(a);
	
	Map<String, Integer> m= new HashMap<>();
	m.put("Gopi", 1);
	m.put("Gopi1", 2);
	m.put("Gopi2", 3);
	m.put("Gopi3", 4);
	m.put("Gopi4", 1);
	
	Set<Entry<String,Integer>> entrySet = m.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		//System.out.println(entry);
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	LinkedHashMap<Integer, Float> m1=new LinkedHashMap<>();
	
	m1.put(1, 123.123f);
	m1.put(2, 124.123f);
	m1.put(3, 125.123f);
	m1.put(4, 126.123f);
	m1.put(1, 127.123f);
	
	Set<Entry<Integer,Float>> entrySet2 = m1.entrySet();
	for (Entry<Integer, Float> entry : entrySet2) {
		System.out.println(entry);
	}
	
	
	Map<String, String> m3 = new TreeMap<>();

	m3.put("anandh", "get");
	m3.put("anandh1", "put");
	m3.put("anandh2", "post");
	m3.put("anandh3", "delete");
	m3.put("anandh4", "get");
	
	
	
	Set<Entry<String,String>> entrySet3 = m3.entrySet();
	System.out.println(entrySet3);
	

	
	Hashtable<String, Integer> hs = new Hashtable<>();
	hs.put("!", 10);
	hs.put("@", 20);
	hs.put("#", 30);
	hs.put("%", 40);
	hs.put("^", 50);
	hs.put("&", 60);
	hs.put("&", 70);
	
	Set<Entry<String, Integer>> entrySet4 = hs.entrySet();
	for (Entry<String, Integer> entry : entrySet4) {
		System.out.println(entry);
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}

}
}
