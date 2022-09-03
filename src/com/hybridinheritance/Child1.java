package com.hybridinheritance;

public class Child1 extends Child{

	private void ch1() {
System.out.println("Child1");
	}
	
	public static void main(String[] args) {
		
		
		Child1 c= new Child1();
		c.ch1();
		c.ch1();
		c.m1();
		c.m2();
	}
}
