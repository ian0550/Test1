package com.lg.carapp.car;

// �ֻ��� Object���� ��� �޾Ƽ� ���

public class Car {
	private String model;
	private int year;
	private String money;
	
//	public Car() {
//		//�⺻ ������
//	}
	// Ŭ���� ���� �ʱ�ȭ
	public Car() {
		model = "K7";
		year = 2020;
		money = "4õ����";
		System.out.println("�⺻ ������ ����!");
		showCarInfo();
	}
	
	//�����ε�
	// 1. �Ű����� ���� �ٸ�.
	// 2. �Ű����� Ÿ���� �ٸ�. 1,2�� �� �� �ϳ��� ������ �ؾ���.
	public Car(String model, int year, String money) {
		super();
		this.model = model;
		this.year = year;
		this.money = money;
	}


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
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
	public void showCarInfo() {
		System.out.println("�� : " + model);
		System.out.println("���� : " + year);
		System.out.println("���� : " + money);
		System.out.println("-----------------------");
		
	}
}
