package org.list;

import java.util.LinkedList;
import java.util.List;

public class ListScenari {
	
	public static void main(String[] args) {
		
		List li = new LinkedList();

		li.add(10);// index 0
		li.add("Java"); // 1
		li.add('M'); //  2
		li.add(98745358732652l); // 3
		li.add(8768768.8765f); // 4
		li.add(9876453576.87645677d); // 5
		li.add(false); // 6
		li.add(10); // 7

		System.out.println(li);

		// to find the length of the list
		int size = li.size();
		System.out.println(size);
		
		// To get particular values 
		 Object object = li.get(6);
		System.out.println(object);
		
		//to remove a particular value from the list
        li.remove(5);
		System.out.println(li);
		
		//indexed based add()
		li.add(2, 200);
		System.out.println(li);
		
		//replace the value
		li.set(1, "Selenium");
		System.out.println(li);
		
		// to Check the Particular value is present or not
		boolean contains = li.contains(10);
		System.out.println(contains);
		
		//To find the index value 
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		int indexOf2 = li.indexOf(100);
		System.out.println(indexOf2);
		
		// To Check List is empty or not
		boolean empty = li.isEmpty();
		System.out.println(empty);
		
		// To Itearte the List
		System.out.println("**Forloop***");
		
		for (int i = 0; i < li.size(); i++) {
			
			Object object2 = li.get(i);
			System.out.println(object2);
			
			// System.out.println(li.get(i));
			
		}
		
		System.out.println("**Foreach***");
		
		for (Object x : li) {
			
			System.out.println(x);
			
		}
		System.out.println("**********");
		
		// to clear ur List
		li.clear();
		
		boolean empty2 = li.isEmpty();
		System.out.println(empty2);
		
		
		
		
	}

}
