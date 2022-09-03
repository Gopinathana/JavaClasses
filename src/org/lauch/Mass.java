package org.lauch;

public class Mass {
	private String reverseString(String str) {
		if (str.isEmpty()) {
			System.out.println("The given String is Empty");

			return str;
		} else {

			return reverseString(str.substring(1)) + str.substring(0);
		}

	}

	private String reverse(String str) {
		String output = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			output = output + str.charAt(i);

		}

		return output;
	}

	public static void main(String[] args) {
		Mass m = new Mass();
		String reverse = m.reverse("matthew");
		System.out.println(reverse);

		String reverseString = m.reverseString("westly");
		System.out.println(reverseString);
	}

}
