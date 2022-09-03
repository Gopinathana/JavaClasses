package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetScenario {

	public static void main(String[] args) {
		
Set<Integer> s = new LinkedHashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(10);
		
		System.out.println(s); //[10, 20, 30, 40, 50, 60]
		
		// To Find the SIze of the Set
		int size = s.size();
		System.out.println(size); // 6
		
		// To remove the particular value
		s.remove(30);
		System.out.println(s); // [10, 20, 40, 50, 60]
		
		// To Check Set is empty or not
		boolean empty = s.isEmpty();
		System.out.println(empty); // false
		
		// To Check the value is present or not
		boolean contains = s.contains(30);
		System.out.println(contains); // false
		
		// To Itearte the Set
		System.out.println("*Foreach***");
		
		for (Integer x : s) {
			
			System.out.println(x);
			
		}
		
		
	}
}
