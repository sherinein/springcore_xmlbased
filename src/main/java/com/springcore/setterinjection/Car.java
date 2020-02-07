package com.springcore.setterinjection;

public class Car {
	private String model;
	private int year;
	private String color;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		System.out.println("Setter Injection "+model);
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		System.out.println("Setter Injection "+year);
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("Setter Injection "+color);
		this.color = color;
	}

}
