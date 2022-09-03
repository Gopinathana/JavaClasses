package org.list;

import java.util.ArrayList;

public class ArryListPrntCoom {
public static void main(String[] args) {
	
	ArrayList a= new ArrayList<>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	
	ArrayList a1= new ArrayList<>();
	a1.add(12);
	a1.add(20);
	a1.add(32);
	a1.add(40);
	a1.add(52);
	
	a.retainAll(a1);
	
	System.out.println(a);
}
}
