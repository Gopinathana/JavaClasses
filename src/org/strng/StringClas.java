package org.strng;

public class StringClas {

	public static void main(String[] args) {
		
		// literal
		String s = "Gopi";
		int hashCode = s.hashCode();
		System.out.println("Gopi ---"+hashCode);
		
		String s2="Gopi";
		int hascode2=s2.hashCode();
		System.out.println("Gopi ---"+hascode2);
		
		String s3 = "gopi";
		int hascode3=s3.hashCode();
		System.out.println("gopi ---"+hascode3);
		
		String s4="anan";
	    int hascode4=s4.hashCode();
		System.out.println("anan"+hascode4);
		
		
		//nonLiterl String
		
		String s5= new String("Java");
		int hascode5=s5.hashCode();
		System.out.println("Java  -"+hascode5);
		
		String s6 = new String("Java");
		int hashCode6 = s6.hashCode();
		System.out.println("Java  -"+hashCode6);
		
		String s7 = new String("java");
		int hashCode7 = s7.hashCode();
		System.out.println("java  -"+hashCode7);
		
		
		String s8 = new String("selenium");
		int hashCode8 = s8.hashCode();
		System.out.println("Selenium -"+hashCode8);
		
		
		
		
		
		
		
		
		
	}
	
}
