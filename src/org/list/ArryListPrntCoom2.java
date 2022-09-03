package org.list;

import java.util.ArrayList;

public class ArryListPrntCoom2 {
public static void main(String[] args) {
	
	ArrayList a= new ArrayList<>();
	a.add("Java");
	a.add("Selenium");
	a.add("cucumber");
	a.add(32);
	
	a.add("52");
	
	ArrayList a1= new ArrayList<>();
	a1.add("Java");
	a1.add("selenium");
	a1.add(32);
	a1.add("add");
	a1.add(52);
	
	a.retainAll(a1);
	
	System.out.print(a);
	
	
	System.out.print("java course"+"sql");
	System.out.print("java course"+"sql");
	System.out.print("java course"+"sql");
	System.out.println("java course"+"sql");
	System.out.println("java course"+"sql");
	System.out.println("java course"+"sql");
	
}
}
