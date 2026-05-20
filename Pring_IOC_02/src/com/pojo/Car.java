package com.pojo;

public class Car {
	
	private String carname;
	private String carmodel;
	private Engine engine;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Engine [carname=" + carname + ", carmodel=" + carmodel + ", engine=" + engine + "]";
	}
	

}
