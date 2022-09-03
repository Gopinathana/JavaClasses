package org.retn;

public class ReturnType5 {

	
	private int m1(int a,int b) {
		
		if(a>b)
			return a+b;
		
		else
			return a-b;
		
	}
	public static void main(String[] args) {
		ReturnType5 r = new ReturnType5();
		int m1 = r.m1(2, 22);
		System.out.println(m1);
	}
}


