package org.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayLstLength {

	
	public static void main(String[] args) {
		List<Integer> li= new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(10);
		
		
		int indexOf2 = li.indexOf(10);
		System.out.println(indexOf2);
		
		for (Integer l : li) {
			System.out.println(l);
		}
		
		
		int size = li.size();
		System.out.println(size);
		
		List li2=new ArrayList<>();
		li2.add("dtd");
		li2.add(13);
		li2.add(14);
		li2.add(15);
		li2.add(16);
		li2.add(15);
		
		for (Object l2 : li2) {
			System.out.println(l2);
		}
		
		Integer integer = li.get(0);
		System.out.println(integer);
		
		Object object2 = li2.get(4);
		System.out.println(object2);
		
		int size2 = li2.size();
		System.out.println(size2);
		
		List li3 = new Vector();
		li3.add(70);
		li3.add(45);
		li3.add(54);
		li3.add(66);
		li3.add(78);
		li3.add(44);
		li3.add(70);
		
		for (Object l3 : li3) {
			System.out.println(l3);
		}
		
	
		
		Object object = li3.get(2);
		System.out.println(object);
		
		int size3 = li3.size();
		System.out.println(size3);
		
		
		
		int fst = li.indexOf(10);
		System.out.println(fst);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		
		int indexOf = li2.indexOf(15);
		System.out.println(indexOf);
		
		int lastIndexOf2 = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
	}
}
