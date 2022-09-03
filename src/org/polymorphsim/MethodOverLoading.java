package org.polymorphsim;

public class MethodOverLoading {

	// Based on Data type count
	public void empdetails(int id) {
		System.out.println("Emp Id Is:" + id);
		this.empdetails(02, "gopi1");
	}

	public void empdetails(int rollNumb, String name) {
		System.out.println("Emp Rollnumber Is:" + rollNumb + " Employe Name Is:" + name);
		this.empdetails(03, "gopi2", 123456789);
	}

	public void empdetails(int rollNumb, String name, long mobile) {
		System.out.println(
				"Emp Rollnumber Is:" + rollNumb + " Employe Name Is:" + name + " Employee Mobile Number is:" + mobile);
		this.empdetails(04, "gopi3", 1928748274, "gopi@2334");
	}

	public void empdetails(int rollNumb, String name, long mobile, String email) {
		System.out.println("Emp Rollnumber Is:" + rollNumb + " Employe Name Is:" + name + " Employee Mobile Number is:"
				+ mobile + " Employee Email Is:" + email);
		this.empdetails(05, "gopi4", 12746828, "gopi@231", 732467.1244d);
	}

	public void empdetails(int rollNumb, String name, long mobile, String email, double salary) {
		System.out.println("Emp Rollnumber Is:" + rollNumb + " Employe Name Is:" + name + " Employee Mobile Number is:"
				+ mobile + " Employee Email Is:" + email + " EMployee Salary Is:" + salary);
		this.empdetails(06, "gopi5", 763476984, "gopi@745", 732648.2342, "chennai");
	}

	public void empdetails(int rollNumb, String name, long mobile, String email, double salary, String location) {
		System.out.println("Emp Rollnumber Is:" + rollNumb + " Employe Name Is:" + name + " Employee Mobile Number is:"
				+ mobile + " Employee Email Is:" + email + " EMployee Salary Is:" + salary + "Chennai" + location);
		this.empdetails(07, "gopi6", 984657231, "gopi@948365", 2983746.234, 'm');
	}

	public void empdetails(int rollNumb, String name, long mobile, String email, double salary, char gender) {
		System.out.println("Emp Rollnumber Is:" + rollNumb + " Employe Name Is:" + name + " Employee Mobile Number is:"
				+ mobile + " Employee Email Is:" + email + " EMployee Salary Is:" + salary + " Employee Gender Is:"
				+ gender);
		this.empdetails(12, "gopi7", 238750983l, "gopi@984375", 29387.4683456, 'f', true);
	}

	public void empdetails(int rollNumb, String name, long mobile, String email, double salary, char gender,
			boolean condition) {
		System.out.println("Emp Rollnumber Is:" + rollNumb + " Employe Name Is:" + name + " Employee Mobile Number is:"
				+ mobile + " Employee Email Is:" + email + " EMployee Salary Is:" + salary + " Employee Gender Is:"
				+ gender + " Employee Workinin status:" + condition);
		this.empdetails("anandh");
	}
	// Arguments depents on datatype

	public void empdetails(String name) {
		System.out.println(" Employe Name Is:" + name);
		this.empdetails(273843648l);
	}

	public void empdetails(long mobile) {
		System.out.println(" Employee Mobile Number is:" + mobile);
		this.empdetails('m');
	}

	public void empdetails(char jendre) {
		System.out.println(jendre);
		this.empdetails(2879354.934587f);
	}

	public void empdetails(float salary) {
		System.out.println(" EMployee Salary Is:" + salary);
		this.empdetails(83648.734);
	}

	public void empdetails(double salary2) {
		System.out.println(" EMployee Salary Is:" + salary2);
		this.empdetails(false);
	}

	public void empdetails(boolean condition) {
		System.out.println(condition);
		this.empdetails("dhinesh", 213, 217836872l, "gopi@928347", 237864.231, 'm', true);
	}

	// Arguments based on order

	public void empdetails(String name, int rollNumb, long mobile, String email, double salary, char gender,
			boolean condition) {
		System.out.println(name + "Emp Rollnumber Is:" + rollNumb + " Employee Mobile Number is:" + mobile+"\n"
				+ " Employee Email Is:" + email + " EMployee Salary Is:" + salary + " Employee Gender Is:" + gender+"\n"
				+ " Employee Workinin status:" + condition);
		this.empdetails("gopi213", 12321444l, 2387, "gopi@903248", 973422.1234, 'f', true);
	}

	public void empdetails(String name, long mobile, int rollNumb, String email, double salary, char gender,
			boolean condition) {
		System.out.println(" Employe Name Is:" + name + " Employee Mobile Number is:" + mobile + "Emp Rollnumber Is:"
				+ rollNumb +"\n"+ " Employee Email Is:" + email + " EMployee Salary Is:" + salary + " Employee Gender Is:"
				+ gender +"\n"+ " Employee Workinin status:" + condition);
		this.empdetails("gopi44", 98327424, "gopi@98324", 54, 87123.219863d, 'g', false);
	}

	public void empdetails(String name, long mobile, String email, int rollNumb, double salary, char gender,
			boolean condition) {
		System.out.println(" Employe Name Is:" + name + " Employee Mobile Number is:" + mobile + " Employee Email Is:"
				+ email +"\n"+ "Emp Rollnumber Is:" + rollNumb + " EMployee Salary Is:" + salary + " Employee Gender Is:"
				+ gender +"\n"+ " Employee Workinin status:" + condition);
		this.empdetails("gopie", 23897490324l, "gopi@72364", 23986.8787, 32874, 'f', true);
	}

	public void empdetails(String name, long mobile, String email, double salary, int rollNumb, char gender,
			boolean condition) {
		System.out.println(" Employe Name Is:" + name + " Employee Mobile Number is:" + mobile + " Employee Email Is:"
				+ email +"\n"+ " EMployee Salary Is:" + salary + "Emp Rollnumber Is:" + rollNumb + " Employee Gender Is:"
				+ gender+"\n" + " Employee Workinin status:" + condition);
		this.empdetails("gopiyg", 345352523, "gopi@283947", 3724423.235, 'm', 3274, false);
	}

	public void empdetails(String name, long mobile, String email, double salary, char gender, int rollNumb,
			boolean condition) {
		System.out.println(" Employe Name Is:" + name + " Employee Mobile Number is:" + mobile + " Employee Email Is:"
				+ email +"\n"+ " EMployee Salary Is:" + salary + gender + "Emp Rollnumber Is:" + rollNumb
				+ " Employee Workinin status:" + condition);
		this.empdetails("gopi", 92384843l, "gopi@435", 923847.12423, 'm', true, 12);
	}

	public void empdetails(String name, long mobile, String email, double salary, char gender, boolean condition,
			int rollNumb) {
		System.out.println(" Employe Name Is:" + name + " Employee Mobile Number is:" + mobile + " Employee Email Is:"
				+ email+"\n" + " EMployee Salary Is:" + salary + gender + "Emp Rollnumber Is:" + rollNumb
				+ " Employee Workinin status:" + condition);
		this.empdetails("gopi@23432", 9832764978l, 723648723.234, 'm', true, 83);
	}

	public void empdetails(String email, long mobile, double salary, char gender, boolean condition, int rollNumb) {
		System.out.println(email + " Employee Mobile Number is:" + mobile + salary + " Employee Gender Is:" + gender
				+"\n"+ " Employee Workinin status:" + condition + "Emp Rollnumber Is:" + rollNumb);
		this.empdetails(983274.23423, 234234234l, "gopiw", "gopid@324", 'm', false, 83274);
	}

	public void empdetails(double salary, long mobile, String name, String email, char gender, boolean condition,
			int rollNumb) {
		System.out.println(salary + " Employee Mobile Number is:" + mobile + " Employe Name Is:" + name
				+ " Employee Email Is:" + email + " Employee Gender Is:" + gender+"\n" + " Employee Workinin status:"
				+ condition + "Emp Rollnumber Is:" + rollNumb);
		this.empdetails(923847932, "gopiwa", "gopi@234", 892743.213, 'f', false, 2332);
	}

	public void empdetails(long mobile, String name, String email, double salary, char gender, boolean condition,
			int rollNumb) {
		System.out.println(" Employee Mobile Number is:" + mobile + " Employe Name Is:" + name + " Employee Email Is:"
				+ email + " EMployee Salary Is:" + salary + " Employee Gender Is:" + gender +"\n"+ "Emp Rollnumber Is:"
				+ rollNumb + " Employee Workinin status:" + condition);
	}
	
	public static void main(String[] args) {
		
		MethodOverLoading m = new MethodOverLoading();
		m.empdetails(01);
	}


}
