package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayToListToArray {

	public static void listTOArray() {
		List<String> li = new ArrayList<String>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		String[] a = new String[4];
		int j = 0;
		// si 4-1=3 2 1 0
		for (int i = li.size() - 1; i >= 0; i--) {
			// 3=d
			String string = li.get(i);
			// 3 d
			a[j] = string;
			// System.out.println(a[i]);
			j++;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

	private static void listToARR() {

		List<String> li = new ArrayList<String>();

		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");

		Object[] array = li.toArray();
		for (Object object : array) {
			System.out.println(object);
		}

	}

	public static void arrayToList() {
		Integer a[] = new Integer[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		List<Integer> asList = Arrays.asList(a);
		System.out.println(asList);

		// Object[] array = asList.toArray();
		//
		// System.out.println(array);

		Integer n[] = new Integer[asList.size()];
		for (int i = asList.size() - 1; i >= 0; i--) {
			System.out.println(asList.get(i));
			n[i] = asList.get(i);

		}
		for (Integer x : n) {
			System.out.println(x + " ");
		}

	}

	public static void main(String[] args) {

		// arrayToList();
		listTOArray();
		// listToARR();

	}

}
