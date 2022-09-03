package org.polymorphsim;

public class MethodOverriding4 extends MethodOverriding5 {
public void parent() {
System.out.println("oevrride4");
this.parent2();
super.parent2();
}

public void parent2() {
System.out.println("oevrride42");
}
}
	