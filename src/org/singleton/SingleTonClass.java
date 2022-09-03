package org.singleton;

public class SingleTonClass {

	public void test() {
		System.out.println("Software Tester");
	}
	
	//To Restrict the object creation
	private SingleTonClass() {
		
	}
	
	//To create static variable based on the class name
	public static SingleTonClass obj;
	
	public static SingleTonClass singletonObject() {
		
		if (obj==null) {
			obj=new SingleTonClass();
		}
		return obj;
	}
	
}
