package org.encap;

public class Encapsulation {

	// binding the datas and code act on the data together form a single unit
	// binding the data means private variable each private we wont access outside
	// the class.
	// if we need to access the datas from the POJO class,
	// POJO class : it is the architecture that contains the private instance
	// variable(data containers)
	// and public getters and public setters
	// Throgh the setter we are assign the values dynamically to the private objects
	// or ref or datas
	// it has some normal methods or functions scope may be public or private to
	// process the datas
	// getter to retrieve the datas from the POJO class
	// In out previous project we implements the encaps concepts on page object
	// model(POM)

	// frequently use inheritance concepts is hierarchical inheritance. for example one
	// class has number of reusable methods that class uses in many places by
	// inheriting the class. therefore the one super class(parent) accessed by a many sub
	// classes(child) is known as hierarchical inheritance
	
	//types of variable, scope of variable, access and modifier specifier, static

	private String username; //10
	private String password;
	private String login;

	public String getUsername() {
		return username;
	}
//                                  10
	public void setUsername(String username) {
		//               10
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		
		return login;
	}

	public void validateUser() {
		if (username.equals("gopi")&&password.equals("gopinath")) {
			this.login = "valid user";
		}
		else {
			this.login = "Invalid user";
		}
		
	}

}
