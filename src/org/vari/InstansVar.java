package org.vari;

public class InstansVar {

	String s="kjdbc";
	
	
	 /* declaration of instance variables. */  
     public static int a;//default value is 0
   
    void m1() {
	   a=10;
	   //System.out.println(a);
}
   public static void main(String[] args) {
	

   InstansVar i = new InstansVar();
   System.out.println(i.a);
   i.m1();
   System.out.println(i.a);
   
}  

	
}

