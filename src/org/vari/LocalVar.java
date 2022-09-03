package org.vari;

public class LocalVar extends StaticVar {

	
	
	private int m1(int a, int c) {
		int d; // Local variables

		d=a+c;
		
		return d;
	}

	public static void main(String[] args) {
		LocalVar localVar = new LocalVar();
		int m1 = localVar.m1(10, 20);
		System.out.println(m1);
		
		System.out.println(StaticVar.a);
		System.out.println(a);
	
		
	
		
	}

}
