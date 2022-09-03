package org.encap;

public class Model {
	static Encapsulation encapsulation;
	public static void main(String[] args) {
		encapsulation = new Encapsulation();
		encapsulation.setUsername("gopi");
		encapsulation.setPassword("gopiath");
		encapsulation.validateUser();
		String login = encapsulation.getLogin();
		System.out.println(login);
		
	}
}
