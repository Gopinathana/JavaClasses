package org.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.list.HasSets;

public class Setsc {

	
	public static void main(String[] args) {
		HashSet  h= new HashSet<>();
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(60);
		h.add(70);
		h.add(80);
		h.add(90);
		h.add(10);
		h.add(20);
		
				for (Object object : h) {
				System.out.println(object);	
				}
				
				System.out.println();
				
				LinkedHashSet lk=new LinkedHashSet<>();
				lk.add(12);
				lk.add(32);
				lk.add(42);
				lk.add(52);
				lk.add(62);
				lk.add(72);
				lk.add(12);
				
				for (Object x : lk) {
					System.out.println(x);
				}
				
				System.out.println();
				
				TreeSet t= new TreeSet<>();
				t.add(12);
				t.add(18);
				t.add(45);
				t.add(67);
				t.add(56);
				t.add(12);
				
				
				for (Object y : t) {
					System.out.println(y);
				}
				
				System.out.println();
				
				List list = new ArrayList();
				list.add(278);
				list.add("Java");
				list.add('g');
				list.add(1);
				list.add(21);
				list.add(278);
				list.add(278);
				list.add(278);
				
				for (Object e : list) {
					System.out.println(e);
				}
				System.out.println();
				Set s= new LinkedHashSet<>();
				s.addAll(list);
				for (Object object : s) {
					
				
				System.out.println(object);
				}
				
				
				
				
	}
	
	
}
