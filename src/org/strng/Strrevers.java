package org.strng;

public class Strrevers {
	
	//Striing Revers
private static String m1(String name) {
   String revers="";
   
	for (int i = name.length()-1; i >=0 ; i--) {
		char ch=name.charAt(i);
		revers=revers+ch;
	}
	return revers;
}


//String Revers With Space
private static String m2(String name) {
String output="";

String[] split = name.split(" ");
for (String string : split) {
	

for (int i = string.length()-1; i >=0; i--) {
	char charAt = string.charAt(i);
	output=output+charAt;
	
}
output=output+" ";
}
return output;
}

//get number,upeercase,lower and special character from String
private static int m3(String email) {

	
	
	for(int i=email.length()-1; i>=0; i--) {
	char cha = email.charAt(i);
	
	if(cha<='a' && cha>='z') {
		int lowercasecount = 0;
		lowercasecount++;
		return lowercasecount;
	}
	else if (cha<='A' && cha>='Z') {
		int uppercasecount = 0;
		uppercasecount++;
		return uppercasecount;
	}
	else if (cha<='1' && cha>='9') {
		int numbercount = 0;
		numbercount++;
		return numbercount;
	}
	else {
		int specialcharacter = 0;
		specialcharacter++;
		return specialcharacter;
	}
	
	
	}
	return 0;
}
	

private void getheSumOfNumericValue(String name) {

	for (int i = 0; i < name.length()-1; i--) {
		char c = name.charAt(i);
		if (c<='0' && c>='9') {

			
		}
		
	}
}


public static void main(String[] args) {
	String m1 = m1("GOpi@123");
	System.out.println(m1);
	String m2 = m2("Gopi@123 !&.com");
	System.out.println(m2);
	
	
}
}

