package org.list;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {

		List<Integer> li = new LinkedList<>();

		li.add(10);// index 0
		li.add(20); // 1
		li.add(30); // 2
		li.add(40); // 3
		li.add(50); // 4
		li.add(60); // 5
		li.add(20); // 6
		li.add(10); // 7
		System.out.println(li); // [10, 20, 30, 40, 50, 60, 20, 10]

		// TO Check List is empty or not
		boolean empty = li.isEmpty();
		System.out.println(empty);
		// To Create Set

		Set<Integer> s = new LinkedHashSet<>();

		System.out.println(s);

		// To Check Set is empty or not
		boolean empty2 = s.isEmpty();
		System.out.println(empty2); // true

		// To add all the Values from List to SEt
		s.addAll(li);
		System.out.println(s); // [10, 20, 30, 40, 50, 60]

		s.add(100);
		s.add(200);
		s.add(300);// To Add Some Extra Values To The Set

		System.out.println(s); // [10, 20, 30, 40, 50, 60, 100, 200, 300]

		// To get common values to Both list set
		// s.retainAll(li);
		// System.out.println(s); // [10, 20, 30, 40, 50, 60]
		//
		// to remove the Common values both
		s.removeAll(li);
		System.out.println(s); // [100, 200, 300]

	}
}
