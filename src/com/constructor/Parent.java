package com.constructor;

public class Parent {

	public Parent(String name) {
		this(10);
		System.out.println(name);
	
	
	}
	
	public Parent(int a) {
		this(20, "gopi1");
		System.out.println(a);
	}
	
	public Parent(int a,String name) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
	
	Parent parent= new Parent("Gopi");

}
}