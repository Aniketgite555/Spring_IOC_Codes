package com.ConstructorBased;

public class Company {
	
	private int cid;
	
	private String cname;

	public Company(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + "]";
	}

}
