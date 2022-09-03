package org.abstrct;

public class Constructors1 extends Constructors2{

	public Constructors1() {
		this(12,"java");
System.out.println("non");
	}
	
	public Constructors1(boolean condition) {
		System.out.println(condition);
		
	}

	
	public Constructors1(int id, String name) {
		System.out.println(id+ " " +name);
	}
	

}
