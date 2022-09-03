package org.override;

public class ChildClass extends Parent{

@Override
public void m1() {
	System.out.println("child");
	super.m1();
	super.m2();
}

@Override
public void m2() {
		System.out.println("child");
	}

public static void main(String[] args) {
	ChildClass childClass= new ChildClass();
	childClass.m1();
	childClass.m2();
	
}
	
}
