package org.strng;

public class StrinClas {

	public static void main(String[] args) {
		
		
//	    index 0123456789-------n-1
			String s = "Welcome To Java Class";
			System.out.println(s); // Welcome To Java Class

			// size of given string
			int length = s.length();
			System.out.println(length); // 21 
			
			// To check String is empty or Not
			boolean empty = s.isEmpty();
			System.out.println(empty); // false
			
			// to find a character at a particular index 
			char charAt = s.charAt(2);
			System.out.println(charAt); // l
			
			// to  find index position of a particular character
			int indexOf = s.indexOf("e"); // First occurrence
			System.out.println(indexOf); // 1
			
			int lastIndexOf = s.lastIndexOf("e");
			System.out.println(lastIndexOf); // 6

			int indexOf2 = s.indexOf("z");
			System.out.println(indexOf2); // -1
			
			//to change the given string into upper case letters
			String upperCase = s.toUpperCase();
			System.out.println(upperCase); // WELCOME TO JAVA CLASS
			
			// to change the given string into lower case letters
			String lowerCase = s.toLowerCase();
			System.out.println(lowerCase); // welcome to java class
			
			// to check starts with a particular character
			boolean startsWith = s.startsWith("Welcome");
			System.out.println(startsWith);		 // true
			
			// to check ends with a particular character
			boolean endsWith = s.endsWith("Class");
			System.out.println(endsWith);  // true
			
			//to check a particular character is present in the string or not
			boolean contains = s.contains("J");
			System.out.println(contains); // true
			
			//to replace a particular character
			String replace = s.replace("e", "*");
			System.out.println(replace); // W*lcom* To Java Class
			
			String replaceAll = s.replaceAll("Java", "Selenium");
			System.out.println(replaceAll); // Welcome To Selenium Class
			
			//to delete all characters present in string or remove unwanted space from string ("")
			String trim = s.trim();
			System.out.println(trim); // Welcome To Java Class
			
			//to get the particular value from string
			String substring = s.substring(7);
			System.out.println(substring); //  To Java Class
			
			String substring2 = s.substring(0, 7);
			System.out.println(substring2); // Welcome
			
			//to split the given string
			String[] split = s.split(" ");
			
			for (String x : split) {
				
				System.out.println(x);
				
			}
			
	}
}
