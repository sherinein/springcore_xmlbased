package com.springcore.innerbean;

public class Car {
	private String model;
	private int year;
	private String color;
	private Driver drname;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Driver getDrname() {
		return drname;
	}
	public void setDrname(Driver drname) {
		this.drname = drname;
	}

}
