package com.mainmethod;



/*We can override the main method
But we cant override the main method and static methods, becous of it is not based on object it based on the class*/


public class OverloadMainMethod {

	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(double salary) {
		System.out.println(salary);
	}
	
	public static void main(boolean condition) {
		System.out.println(condition);
	}
	
	public static void main(String[] args) {
		
		main(true);
		main(12313.12);
		main(10);
	}
}
