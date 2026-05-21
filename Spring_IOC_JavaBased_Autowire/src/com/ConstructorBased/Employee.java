package com.ConstructorBased;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int Eid;
	
	private String ename;
	
	
	@Autowired
	private Company company;

	public Employee(int eid, String ename, Company company) {
		super();
		Eid = eid;
		this.ename = ename;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", ename=" + ename + ", company=" + company + "]";
	}
	
	

}
