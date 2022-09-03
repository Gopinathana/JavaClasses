package org.list;

import java.util.ArrayList;

public class ArryListPrntCoom3 {
public static void main(String[] args) {
	
	ArrayList<String> a= new ArrayList<>();
	a.add("Java");
	a.add("maven");
	a.add("git");
	a.add("jenkins");
	a.add("Bakend");
	
	ArrayList a1= new ArrayList<>();
	a1.add("Java");
	a1.add("sel");
	a1.add(21);
	a1.add("maven");
	a1.add(22);
	
	a.retainAll(a1);
	
	System.out.println(a);
	
	
	a.remove(0);
	a.remove("Java");
		a.removeAll(a);
		a1.removeAll(a1);
		System.out.println(a);
		System.out.println(a1);
					
		
		
}
}
