package org.strng;

import java.util.Scanner;

public class FIndTwoAtrEquls {
public static void main(String[] args) {
	
	
	String s="gopi";
	String s1="anandh";
	
	boolean b=s.equals(s1);
	System.out.println(b);
	
	String g ="Green Technology";
	String g1 ="GreenTechnology";
	
	boolean equals = g.equals(g1);
	System.out.println(equals);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("pls enter your first name");
	String name1 = sc.next();
	System.out.println("pls enter your second name");
	String name2 = sc.next();
	
	boolean e = name1.equals(name2);
	System.out.println("Given Two String is "+e);
	
	
	
	String email = sc.next();
	System.out.println("Enter Your Email Adress");
	boolean spec = email.contains("@");
	System.out.println(spec);
	
	
	
}
}
