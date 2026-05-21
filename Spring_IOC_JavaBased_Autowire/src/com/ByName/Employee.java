package com.ByName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int id;
	
	private String name;
	
	@Autowired
	@Qualifier(value = "c")
	private Company company;
	
	@Autowired
	@Qualifier(value = "c1")
	private Company company1;

	public Company getCompany1() {
		return company1;
	}

	public void setCompany1(Company company1) {
		this.company1 = company1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", company1=" + company1 + "]";
	}
	

}
