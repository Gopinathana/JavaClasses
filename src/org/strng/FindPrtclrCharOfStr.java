package org.strng;

public class FindPrtclrCharOfStr {
public static void main(String[] args) {
	String s1="mach";
	String s2="GreensTechnology";
	String s3="SeleniumAutomationtool";
	String s4="velmurugan";
	String s5="j a v a p r o g r a m ";
	String s6="9095484678";
	
	int i1 = s2.indexOf('o');
	int i2 = s3.indexOf('s');
	int i3 = s4.indexOf('n');
	int i4 = s5.indexOf(' ');
	int i5 = s5.indexOf('5');
	int i6 = s6.indexOf('o');


	String substring = s3.substring(8, 15);
	System.out.println(substring);
	String substring2 = s3.substring(6);
	System.out.println(substring2);
	
	
	int indexOf = s1.indexOf('h');
	
	String s= new String("GOPi");
	int a=s.indexOf('O');
	
	System.out.println(i1+"\n"+i2+"\n"+i3+"\n"+i4+"\n"+i5+"\n"+i6+"\n"+indexOf+"\n"+a);
	
	
}
}
