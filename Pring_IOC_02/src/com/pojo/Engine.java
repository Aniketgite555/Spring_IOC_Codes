package com.pojo;

public class Engine {
	
	private int engid;
	private String engtype;
	public int getEngid() {
		return engid;
	}
	public void setEngid(int engid) {
		this.engid = engid;
	}
	public String getEngtype() {
		return engtype;
	}
	public void setEngtype(String engtype) {
		this.engtype = engtype;
	}
	@Override
	public String toString() {
		return "Engine [engid=" + engid + ", engtype=" + engtype + "]";
	}
	

}
