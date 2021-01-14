package com.lg.carapp;

import com.lg.Array.TestArray;
import com.lg.carapp.car.Car2;
import com.lg.carapp.car.Mname;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 car = new Car2();
		car.showCarInfo();
		
		Car2 car2 = new Car2("Kia","white",5000,"k5");
		car2.showCarInfo();
		
		int arr[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		int arr2[] = {1,2,3,4,5,6,7,8,9,10};
		
		TestArray arr1 = new TestArray();
		
		Mname name = new Mname();
	}

}
