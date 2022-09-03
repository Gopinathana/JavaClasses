package org.strng;

import java.util.Scanner;

public class GetAddrplWithPin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your address");
		String add = sc.nextLine();
		System.out.println(add);
		if (add.contains("603104")) {

			String replace = add.replace("603104", "");
			System.out.println("Replace address is :" + replace);
			// Convert small to caps
			System.out.println("Enter Your Name As Captal letters");
			String name = sc.next();
			String lowerCase = name.toLowerCase();
			System.out.println(lowerCase);
			String upperCase = lowerCase.toUpperCase();
			System.out.println(upperCase);

		}
	}
}
