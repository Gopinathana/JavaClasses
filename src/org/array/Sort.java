package org.array;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {

		int a[] = { -12, 0, -2, 32, -1, 32, 50, -9 };
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
