package org.polymorphsim;

public class OverRideWithOverLoad2 extends OverRideWithOverLoad{

	@Override
	public void m1(int id) {
		System.out.println();super.m1(id);
	}
	
	private void m2() {
		System.out.println("Child m2");
	}
	

	public static void main(String[] args) {
		
		OverRideWithOverLoad2 load2= new OverRideWithOverLoad2();
		load2.m1(1);
		
		
	}
	
}
