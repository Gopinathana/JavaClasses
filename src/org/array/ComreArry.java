package org.array;

import java.util.Arrays;

public class ComreArry {
public static void main(String[] args) {
	
			// Declaring integer arrays
			int a[]=new int[3];
			a[0]=10;
			a[0]=20;
			a[0]=30;
			
			int b[]=new int[3];
			b[0]=10;
			b[0]=20;
			b[0]=30;
			
			
			// Checking if above two arrays are equal
			// using equals() method
			if (Arrays.equals(a, b))

				// Print statement if arrays are equal
				System.out.println("Same");
		
			
			else
				

				// Print statement if arrays are equal
				System.out.println("Not same");
			 
	
}
}
