package org.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
		Integer a[] = new Integer[6];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		// String string = Arrays.toString(a);
		// System.out.println(string+"gobi");
		List<Integer> li = Arrays.asList(a);
		// System.out.println(li);
		Set<Integer> st = new TreeSet<Integer>();
		st.addAll(li);
		System.out.println(st);

		String a1[] = new String[6];
		a1[0] = "guna";
		a1[1] = "tamil";
		a1[2] = "suriya";
		a1[3] = "mahash";
		a1[4] = "rahul";
		a1[5] = "hari";
		List<String> li1 = Arrays.asList(a1);

		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		int i = 0; // initialization
		for (Integer s : st) { // no of times loop execute = condition
			m.put(s, li1.get(i));
			i++; // condition
		}
		System.out.println(m);

	}

}
