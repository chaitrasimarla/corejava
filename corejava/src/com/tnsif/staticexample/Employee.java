package com.tnsif.staticexample;

public class Employee {
	int eid;
	String name;
	static String company="TNS";
	public Employee(int r, String n) {
		eid = r;
		name = n;
	}
	void display() {
		System.out.println(eid+""+name+""+company);
	}

}
