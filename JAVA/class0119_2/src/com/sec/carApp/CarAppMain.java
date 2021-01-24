package com.sec.carApp;

import java.util.Random;

import com.sec.carApp.car.Car;
import com.sec.carApp.customer.Customer;

public class CarAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"홍길동","김길동","박길동","이길동","최길동"};
		String tel[] = {"010-1234-1234", "010-1234-1235", "010-1234-1236", "010-1234-1237", "010-1234-1238"};
		String address[] = {"대구시 동구 신암4동", 
				"서울시 동구 신암4동", "부산시 동구 신암4동", 
				"인천시 동구 신암4동", "광주시 동구 신암4동"};
		String model[] = {"SM6", "소나타", "싼타페", "K7", "그랜져"};
		String color[] = {"블랙", "은색", "흰색", "회색", "빨강"};
		int year[] = {2021, 2020, 2019, 2018, 2017};
		String company[] = {"르노삼성", "현대", "기아", "쌍용", "GM"};
		String price[] = {"2천오백만원", "3천만원", "3천오백만원", "4천만원", "4천오백만원"};
		
		Random r = new Random();
		Customer cu[] = new Customer[10];
		for (int i = 0; i < cu.length; i++) {
			System.out.println("번호 : " + (i+1));
			cu[i] = new Customer(name[r.nextInt(5)], tel[r.nextInt(5)], address[r.nextInt(5)], 
					new Car(model[r.nextInt(5)], year[r.nextInt(5)], color[r.nextInt(5)],
							company[r.nextInt(5)], price[r.nextInt(5)]));
			cu[i].printCustomerInfo();
		}
	}

}
