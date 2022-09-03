package org.strng;

import java.util.Scanner;

public class GetPhonVerfy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your phone");
		String phon = sc.next();
		int length = phon.length();
		if (length>10) {
			System.out.println("invalid Number");
		}else {
		System.out.println("valid number");
	}
	}}
