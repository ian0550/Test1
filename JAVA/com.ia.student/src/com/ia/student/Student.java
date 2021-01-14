package com.ia.student;

public class Student {
	private String name;
	private int age;
	private char gender;
	private String adress;
	
	
	public Student() {
		super();
	}

	public Student(String name, int age, Character gender, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void showStudentInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + adress);
		System.out.println("--------------------");
	}
	
}
