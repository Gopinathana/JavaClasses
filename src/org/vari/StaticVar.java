package org.vari;

public class StaticVar {

 static int a=5;


public void m1() {

this.a=10;
	System.out.println(a);
	
}
public static void main(String[] args) {
	
	System.out.println(10);
	
	StaticVar s = new StaticVar();
	s.m1();
}

}  

	


