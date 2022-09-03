package org.strng;

public class FindUpLcSpec {
public static void main(String[] args) {
	


			String str = "Gopianandh022@gmail.comS";
			
			int upper=0,lower=0,specia=0,number=0;
			for(int i =0; i<str.length();i++) {
			char charAt = str.charAt(i);
			
			if(charAt>='A'&& charAt<='Z')
				upper++;
			
			if(charAt>='a'&&charAt<='z') 
				lower++;
			
			
			if(charAt>='0'&&charAt<='9') 
				
				number++;
			
			else 
				
				specia++;
			
			
}
			System.out.println("Upper:"+upper);
			System.out.println("Lower:"+lower);
			System.out.println("specia:"+specia);
			System.out.println("numbers:"+number);
			
}}

