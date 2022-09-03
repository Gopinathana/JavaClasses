package com.userdefine;

import java.util.ArrayList;
import java.util.List;

public class UserDefineList {

	public static void main(String[] args) {
		
		UserDefineListPojo d= new UserDefineListPojo();
		d.setId(1);
		d.setName("gopi");
		d.setSalary(348124.324);
		
		UserDefineListPojo d1= new UserDefineListPojo();
		d1.setId(1);
		d1.setName("gopi");
		d1.setSalary(348124.324);
		
		UserDefineListPojo d2= new UserDefineListPojo();
		d2.setId(1);
		d2.setName("gopi");
		d2.setSalary(348124.324);
		
		UserDefineListPojo d3= new UserDefineListPojo();
		d3.setId(1);
		d3.setName("gopi");
		d3.setSalary(348124.324);
		
		
		List<Object> l =new ArrayList<>();
		l.add(d);
		l.add(d1);
		l.add(d2);
		l.add(d3);
		
		for (Object object : l) {
		
			
		
		}
		
		
		
	}
}
