package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrntComnValus {
public static void main(String[] args) {
	HashSet h = new HashSet<>();
	h.add(10);
	h.add(20);
	h.add(30);
	h.add(90);
	h.add(10);
	h.add(10);
	h.add(40);
	h.add(50);
	
	
	HashSet h1 = new HashSet<>();
	
	h1.add(30);
	h1.add(40);
	h1.add(50);
	h1.add(60);
	h1.add(80);
	
	h1.retainAll(h);// To Print The Common Values
	for (Object object : h1) {
		System.out.println(object);
	}
	
	System.out.println();
	
	LinkedHashSet h2 = new LinkedHashSet<>();
	h2.add(10);
	h2.add(20);
	h2.add(30);
	h2.add(90);
	h2.add(10);
	h2.add(10);
	h2.add(40);
	h2.add(50);
	
	
	LinkedHashSet h3 = new LinkedHashSet<>();
	
	h3.add(30);
	h3.add(40);
	h3.add(50);
	h3.add(60);
	h3.add(80);
	h3.add(10);
	h3.add(80);
	
	h3.retainAll(h2);// To Print The Common Values
	for (Object object1 : h3) {
		System.out.println(object1);
	}
System.out.println();
	
	LinkedHashSet t = new LinkedHashSet<>();
	t.add(10);
	t.add(20);
	t.add(30);
	t.add(90);
	t.add(10);
	t.add(10);
	t.add(40);
	t.add(50);
	

	LinkedHashSet t1 = new LinkedHashSet<>();
	
	t1.add(30);
	t1.add(40);
	t1.add(50);
	t1.add(60);
	t1.add(80);
	t1.add(10);
	t1.add(80);
	
	t1.retainAll(t);// To Print The Common Values
	for (Object object2 : t1) {
		System.out.println(object2);
	}
}
}
