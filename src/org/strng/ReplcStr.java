package org.strng;

import java.util.Scanner;

public class ReplcStr {
public static void main(String[] args) {
	
	String s="Welcome to java class";
	//Replace "java into sql"
	String replace=s.replace("java", "sql");
	System.out.println(replace);  //replaced
	
	
	String s1="Greens Adayar";
	//Replace "Greens Adayar"
	String replace1=s1.replace("Adayar", "Omr");
	System.out.println(replace1);  //replaced
	
	String s2="Welcome to java class";
	//Replace "Welcome to java class"
	String replace2=s2.replace(" ", "#");
	System.out.println(replace2);  //replaced
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your email");
	String email = sc.next();
	if(email.contains("gmail")) {
	String	replacd=email.replace("gmail", "yahoo");
	System.out.println("replaced email is:"+replacd);
	}
	
	
	
	
	
}
}
