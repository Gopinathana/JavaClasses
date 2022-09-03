package org.singleton2;

import org.singleton.SingleTonClass;

public class SingleTonClass2 {

	public static void main(String[] args) {
		
		SingleTonClass x = SingleTonClass.singletonObject();
		System.out.println(x);
		
		SingleTonClass y = SingleTonClass.singletonObject();
		System.out.println(y);
		
		SingleTonClass z = SingleTonClass.singletonObject();
		System.out.println(z);
		
		if(x==y && y==z) {
			System.out.println("Three Objects pointed the same location");
		}else {
			System.out.println("different location");
		}
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		
	}
	
}
