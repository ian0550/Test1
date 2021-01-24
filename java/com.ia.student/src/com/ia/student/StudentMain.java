package com.ia.student;

import java.util.Random;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"홍길동","김길동","박길동","이길동","최길동"};
		int age[] = {20, 25, 30, 35, 40};
		char gender[] = {'남', '여'};
		String adress[] = {"대구시 동구 신암4동", "서울시 동구 신암4동", "부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동"};

		Random r = new Random();
		
		Student st[] = new Student[10];
		for (int i = 0; i < st.length; i++) {
			String name1 = name[r.nextInt(5)];
			int age1 = age[r.nextInt(5)];
			char gender1 = gender[r.nextInt(2)]; 
			String adress1 = adress[r.nextInt(5)];
			
			st[i] = new Student(name1, age1, gender1, adress1) ;
			st[i].showStudentInfo();
			
		}

		System.out.println("10번째 학생 정보 변경");
		st[9] = new Student("전우치", 24, '남', "조선 한양인근 두메산골");
		st[9].showStudentInfo();
	}

}
