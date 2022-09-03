package org.comloop;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		
		if(nextInt %2 == 0) {
			
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
		
	}

}
