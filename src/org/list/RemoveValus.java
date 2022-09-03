package org.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveValus {
public static void main(String[] args) {
	List li = new ArrayList<>();
	li.add(10);
	li.add(11);
	li.add(12);
	li.add(13);
	li.add(14);
	li.add(15);
	li.add("java");
	li.add(true);
	
	
	li.set(0, 300);
	li.add(5, "New value added");
	li.add(2, 100);
	Object remove = li.remove(2);
	Object remove1 = li.remove(5);
	Object remove2 = li.remove(3);
	System.out.println(remove);
	for (Object object : li) {
		
		System.out.println(object);
	}
	
	
	
}
}
