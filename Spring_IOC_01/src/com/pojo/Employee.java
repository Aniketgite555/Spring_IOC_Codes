package com.pojo;

public class Employee {
	
	private int Eid;
	
	private String Ename;
	
	private double salary;

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", salary=" + salary + "]";
	}
	public Employee() {
		System.out.println("CONSTRUCTOR CALLED EMPLOYEE");// TODO Auto-generated constructor stub
	}

}
