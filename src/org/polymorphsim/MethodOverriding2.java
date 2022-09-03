package org.polymorphsim;

public class MethodOverriding2 extends MethodOverriding {

@Override
public void parent() {
	System.out.println("kdsjbhf");
	this.parent2();
	super.parent();
}
@Override
	public void parent2() {
System.out.println("kshdbcj");	
	}
public static void main(String[] args) {
	MethodOverriding2 over = new MethodOverriding2();
	over.parent();
	
}
	}

