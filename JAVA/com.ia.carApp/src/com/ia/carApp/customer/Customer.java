package com.ia.carApp.customer;

public class Customer {
	private String name;
	private String tel;
	private String adress;
	
	private String model;
	private String color;
	private int year;
	private String jejo;
	
	public Customer(String name, String tel, String address, String model, String color, int year, String jejo) {
		super();
		this.name = name;
		this.tel = tel;
		this.adress = address;
		this.model = model;
		this.color = color;
		this.year = year;
		this.jejo = jejo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdress() {
		return adress;
	}

	public void setAddress(String adress) {
		this.adress = adress;
	}
	
	public void printCustomerInfo() {
		System.out.println("이름	: " + name);
		System.out.println("전화번호	: " + tel);
		System.out.println("주소	: " + adress);
		System.out.println("모델명	: " + model);
		System.out.println("색상	: " + color);
		System.out.println("연식	: " + year);
		System.out.println("제조사	: " + jejo);
		System.out.println("----------------------");
	}
	
}
