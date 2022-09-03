package com.hybridinheritance;

public class Child implements Parent1 , Parent2{

	private void ch() {
		System.out.println("Child Class");
	}

	@Override
	public void m2() {
		System.out.println("Parent_1 Class");		
	}

	@Override
	public void m1() {
		System.out.println("Parent_2 Class");		
	}
}
