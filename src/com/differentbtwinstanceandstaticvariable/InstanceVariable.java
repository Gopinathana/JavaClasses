package com.differentbtwinstanceandstaticvariable;
public class InstanceVariable {
	int a = 10;

	public void m1() {
		System.out.println(a);
	}
	public void m2() {
		a = a + 20;
		System.out.println(a);
	}
	public void m3() {
		System.out.println(a);
		int a = 20;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		InstanceVariable variable= new InstanceVariable();
		variable.m1();//10
		variable.m2();//30
		variable.m3();//30&20
		
		//Instance variable scope is when the new object created it will take instance values not a last updated values
		
		InstanceVariable variable2= new InstanceVariable();
		System.out.println();
		variable2.m1();//10
		variable2.m2();//30
		variable2.m3();//30&20
	}
}
