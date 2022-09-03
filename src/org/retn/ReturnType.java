package org.retn;

public class ReturnType {


	private static String m1(String name) {
		int cha=0;
		for (int i = 0; i < name.length(); i++) {
			name.toCharArray();
			cha=cha+1;
			
		}
		System.out.println(cha);
		return name;
		
	}
	
	public static void main(String[] args) {
		ReturnType.m1("gopi");
	}
	
}


