package com.ia.carApp.car;

public class Car {
	
	private String model;
	private String color;
	private int year;
	private String jejo;
	
	
	public Car() {
		super();
	}

	public Car(String model, String color, int year, String jejo) {
		super();
		this.model = model;
		this.color = color;
		this.year = year;
		this.jejo = jejo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getJejo() {
		return jejo;
	}

	public void setJejo(String jejo) {
		this.jejo = jejo;
	}
	
	public void printCarInfo() {
		System.out.println("모델명 :	" + model);
		System.out.println("색상 :	" + color);
		System.out.println("연식 :	" + year);
		System.out.println("제조사 :	" + jejo);
		System.out.println("----------------------");
	}
	


}
