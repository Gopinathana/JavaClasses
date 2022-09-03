package org.retn;

public class ReturnType3 {

	
	private int m1(int a, int b) {

		int c=a+b;
		return c;
		
	}
	private String m2(String name1) {
		
		return name1;
	
		
	}
	public static void main(String[] args) {
		
		ReturnType3 r3= new ReturnType3();
		int m1 = r3.m1(12, 23);
	            System.out.println(r3.m2("GOpi1"));
		System.out.println(m1);
		
	}
	
	
	
	
	
	
	
	
}


