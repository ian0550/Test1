package com.ia.carApp;

import com.ia.carApp.customer.*;

import java.util.Random;

import com.ia.carApp.car.Car;

public class CarAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"홍길동","김길동","박길동","이길동","최길동"};
		String tel[] = {"010-1234-5678","010-4321-5678","010-3478-1278","010-4523-1978","010-7890-2134"};
		String adress[] = {"대구시 동구 신암4동", "서울시 동구 신암4동", "부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동"};
		String model[] = {"SM6","쏘나타", "싼타페", "K7", "그랜져"};
		String color[] = {"블랙", "은색", "흰색", "회색", "빨강"};
		int year[] = {2016, 2017, 2016, 2017, 2016};
		String company[] = {"삼성르노", "현대", "현대", "기아", "현대"};
		
		Random r = new Random();
		
		Customer customer[] = new Customer[10];
		for (int i = 0; i < customer.length; i++) {
			String name1 = name[r.nextInt(5)];
			String tel1 = tel[r.nextInt(5)];
			String adress1 = adress[r.nextInt(5)];
			String color1 = color[r.nextInt(5)];
			String model1 = model[r.nextInt(5)];
			int year1 = year[r.nextInt(5)];
			String company1 = company[r.nextInt(5)];
			
			customer[i] = new Customer(name1, tel1, adress1, model1, color1, year1, company1);
			
		}
		for (int i = 0; i < customer.length; i++) {
			System.out.println(i+1 + "번째 손님");
			customer[i].printCustomerInfo();
		}
	}

}

class SingleTest {
	private static SingleTest inst;
	private int data;
	
	SingleTest() {
		data = (int)(Math.random() * 100);
	}
	
	public static SingleTest getInstance() {
		if (inst == null) {
			inst = new SingleTest();
		}
		return inst;
	}
	
	public int getData() {
		return data;
	}
}