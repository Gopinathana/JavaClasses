package org.list;

import java.util.LinkedList;
import java.util.List;

public class ListScenari2 {

	
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();

		li.add(10);// index 0
		li.add(20); // 1
		li.add(30); // 2
		li.add(40); // 3
		li.add(50); // 4
		li.add(60); // 5
		li.add(70); // 6
		li.add(10); // 7

		System.out.println(li); // [10, 20, 30, 40, 50, 60, 70, 10]

		// to find the length of the list
		int size = li.size();
		System.out.println(size);// 8

		// To get particular values
		Integer integer = li.get(5);
		System.out.println(integer); // 60

		// to remove a particular value from the list
		li.remove(5);
		System.out.println(li);//[10, 20, 30, 40, 50, 70, 10]

		// indexed based add()
		li.add(2, 200);
		System.out.println(li); //[10, 20, 200, 30, 40, 50, 70, 10]

		// replace the value
		li.set(1, 100);
		System.out.println(li); // [10, 100, 200, 30, 40, 50, 70, 10]

		// to Check the Particular value is present or not
		boolean contains = li.contains(10);
		System.out.println(contains); // true
		
		// To find the index value
		int indexOf = li.indexOf(10);
		System.out.println(indexOf); // 0

		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf); // 7

		int indexOf2 = li.indexOf(300);
		System.out.println(indexOf2); // -1

		// To Check List is empty or not
		boolean empty = li.isEmpty();
		System.out.println(empty); // false

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
		System.out.println(empty2); // true
	}
}
