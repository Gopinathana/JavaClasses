package org.abstrct;

public class Constructors {

	public Constructors() {
		this(1);
		System.out.println("non parametrised");
  
	}

	protected  Constructors(int id) {
		System.out.println(id);
	}
	
	public static void main(String[] args) {

		
		Constructors c= new Constructors();
	
	}

}
