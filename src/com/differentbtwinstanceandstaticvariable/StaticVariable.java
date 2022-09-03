package com.differentbtwinstanceandstaticvariable;

public class StaticVariable {

	static int a=10;
	
	private void m1() {
		int a=5;
		System.out.println(a);
	}
	private void m2() {
		System.out.println(a);
	}
	private void m3() {
		a=a+10;
		System.out.println(a);
	}
    public static void main(String[] args) {
		
    	StaticVariable variable= new StaticVariable();
    	variable.m1();//5
    	variable.m2();//20
    	variable.m3();//30
    	
    	//Static variable scope is when the control is entered in class and exit the class or end the programe
    	
    	StaticVariable variable1= new StaticVariable();
    	System.out.println();
    	variable1.m1();//5
    	variable1.m2();//20
    	variable1.m3();//30
	}
}
