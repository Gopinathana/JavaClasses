package org.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public final class HasSets {

	public static void main(String[] args) {
		
		HashSet h=new HashSet<>();
		h.add(10);
		h.add('s');
		h.add("gopi");
		h.add(133);
		h.add(1.22);
		h.add(10);
		
		for (Object x : h) {
			System.out.println(x);                                 
		}
		System.out.println();
		
		LinkedHashSet la= new LinkedHashSet<>();                
		la.add(10);
		la.add('s');
		la.add("gopi");
		la.add(133);
		la.add(1.22);
		la.add(10);
		
		for (Object  integer : la) {
			System.out.println(integer);
		}
		System.out.println();
		
	TreeSet<String> t = new TreeSet<>();
	t.add("hgff");
	t.add("fghdf");
	t.add("gopi");
	t.add("dgdfh");
	t.add("hjfj");
	t.add(null);
		for (Object ts : t) {
			System.out.println(t);
		}
	}
}
