package com.lg.carapp;

import java.util.ArrayList;

import com.lg.carapp.car.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 내가 만든 기본 생성자가 없으면 
		// 자바 컴파일러가 자동으로 생성
		// 내가 만든 기본 생성자가 있으면
		// 내가 만든 기본 생성자를 사용.
		/*
		Car car = new Car();
		car.setModel("그랜져 개조");
		car.setYear(2020);
		car.setMoney("3천만원");
		new Car();
		new Car();
		
		Car car2 = new Car("그랜저", 2021, "3천만원");
		car2.showCarInfo();
		*/
		// 객체 생성 X -> 배열만 생성
		Car car3[] = new Car[10];
//		int num[] = new int[10];
//		car3[0] = new Car();
//		car3[9] = new Car();
		
//		for (int i = 0; i < car3.length; i++) {
//			car3[i] = new Car();
//		}

		// 컬렉션 클래스(자료구조) ArrayList
		ArrayList<Car> arrList = new ArrayList<>();
		arrList.add(new Car("소나타", 2020, "2천만원"));
		arrList.add(new Car("SM7", 2021, "3천만원"));
		
		for (int i = 0; i < arrList.size(); i++) {
//			Car mycar = arrList.get(i);
//			mycar.showCarInfo();
			arrList.get(i).showCarInfo(); //위에 두 줄을 한 줄로 합친것.
		}
//		System.out.println(car.getModel());
	}

}
