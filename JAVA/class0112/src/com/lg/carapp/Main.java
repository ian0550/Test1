package com.lg.carapp;

import java.util.ArrayList;

import com.lg.carapp.car.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� �⺻ �����ڰ� ������ 
		// �ڹ� �����Ϸ��� �ڵ����� ����
		// ���� ���� �⺻ �����ڰ� ������
		// ���� ���� �⺻ �����ڸ� ���.
		/*
		Car car = new Car();
		car.setModel("�׷��� ����");
		car.setYear(2020);
		car.setMoney("3õ����");
		new Car();
		new Car();
		
		Car car2 = new Car("�׷���", 2021, "3õ����");
		car2.showCarInfo();
		*/
		// ��ü ���� X -> �迭�� ����
		Car car3[] = new Car[10];
//		int num[] = new int[10];
//		car3[0] = new Car();
//		car3[9] = new Car();
		
//		for (int i = 0; i < car3.length; i++) {
//			car3[i] = new Car();
//		}

		// �÷��� Ŭ����(�ڷᱸ��) ArrayList
		ArrayList<Car> arrList = new ArrayList<>();
		arrList.add(new Car("�ҳ�Ÿ", 2020, "2õ����"));
		arrList.add(new Car("SM7", 2021, "3õ����"));
		
		for (int i = 0; i < arrList.size(); i++) {
//			Car mycar = arrList.get(i);
//			mycar.showCarInfo();
			arrList.get(i).showCarInfo(); //���� �� ���� �� �ٷ� ��ģ��.
		}
//		System.out.println(car.getModel());
	}

}
