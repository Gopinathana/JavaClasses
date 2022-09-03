package org.list;

public class VerifyStarsWith {
public static void main(String[] args) {
	
	
	String s ="gopi is an automation tester";
	String s2="";
	boolean result=s.startsWith("gopi");
	System.out.println(result);
	
	boolean result2=s.startsWith("is");
	System.out.println(result2);
	
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	boolean empty2 = s2.isEmpty();
	System.out.println(empty2);
	
	int i = System.identityHashCode(s);
	System.out.println(i);
	
	int i2 = System.identityHashCode(s2);
	System.out.println(i2);
	
	if(i==i2) {
		System.out.println("i and i2 both memorys are equal");
	}else {
		System.out.println("i and i2 both memorys are notequal");
	}
	
	String st1 = new String("Nisha");
	String st2 = new String("Rengan");
	String st3 = new String("NishaRengan");
	
	
	int it1 = System.identityHashCode(st1);
	int it2 = System.identityHashCode(st2);
	int it3 = System.identityHashCode(st3);

	System.out.println(it1+"\n"+it2+"\n"+it3);
	
	String sss= "Welcome";
	String[] split = sss.split("o");
	for (String x : split) {
		System.out.println(x);

	}
	
}
}
