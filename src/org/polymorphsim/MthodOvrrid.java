package org.polymorphsim;

public class MthodOvrrid extends MethodOverLoading {

	@Override
	public void empdetails(int id) {
		super.empdetails(id);
		this.empdetails();
		System.out.println("Child1");
	}
	private void empdetails() {
		System.out.println("child2");
	}
	
public static void main(String[] args) {
	
	MthodOvrrid m = new MthodOvrrid();
	m.empdetails();
	
}	
		
	
	
}


	