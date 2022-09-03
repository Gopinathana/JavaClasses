package com.overloadingwithsuper;

public class SuperKsy2 extends SuperKsy1{
	private void m2() {
super.m1();
System.out.println("Child");
	}
	public static void main(String[] args) {
		SuperKsy2 s= new SuperKsy2();
		s.m2();
	}
}
