package org.polymorphsim;

public class MethodOverriding extends MethodOverriding3 {
public void parent() {
System.out.println("Overriding3");
this.parent2();
super.parent();
}
public void parent2() {
System.out.println("Overriding3 2");
}

}
