package org.lauch;

public class Laucnh {
	static class Atmecs {
		int i;
		static int j;
		{
			System.out.println(" Instance Block 1. Value of i = " + i);
		}

		static {
			System.out.println(" Static Block 1. Value of j = " + j);
			method_2();
		}
		{
			i = 5;
		}
		static {
			j = 10;
		}

		Atmecs() {
			System.out.println(" Welcome to Atmecs ");
		}

		public static void main(String[] args) {
			Atmecs ib = new Atmecs();
			
		}

		public void method_1() {
			System.out.println(" Instance method. ");
		}

		static {
			System.out.println(" Static Block 2. Value of j = " + j);
		}
		{
			System.out.println(" Instance Block 2. Value of i = " + i);
			method_1();
		}

		public static void method_2() {
			System.out.println(" Static method. ");
		}
	}

	public static void main(String[] args) {

	}

}
