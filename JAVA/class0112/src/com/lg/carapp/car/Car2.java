package com.lg.carapp.car;

public class Car2 {
	private String jejo, color, model;
	private int price;

	public static final String jijum = "���뱸 ������"; // ������ ����� �ϵ� final�� �� �ѹ� ����
	public Car2() {
		jejo = "kia";
		color = "black";
		price = 4000;
		model = "k7";
	}

	public Car2(String jejo, String color, int price, String model) {
		super();
		this.jejo = jejo;
		this.color = color;
		this.price = price;
		this.model = model;
	}
	
	public String getJejo() {
		return jejo;
	}

	public void setJejo(String jejo) {
		this.jejo = jejo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showCarInfo() {
		System.out.println("�븮�� : " + model);
		System.out.println("������ : " + jejo );
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("�̸� : " + model);
		System.out.println("-----------------------");
	}
}
