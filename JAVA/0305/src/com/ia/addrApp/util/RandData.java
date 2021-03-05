package com.ia.addrApp.util;

import java.sql.SQLException;
import java.util.Random;

import com.ia.addrApp.model.AddrBook;

public class RandData {
	static String[] name = { "홍길동", "김길동", "이길동", "박길동", "최길동" };
	static int[] age = {20, 30, 40, 50, 60};
	static String[] tel = { "010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555" };
	static String[] addr = { "대구시 동구 신암동", "서울시 동구 신암동", "대전시 동구 신암동", "부산시 동구 신암동", "광주시 동구 신암동" };
	static String[] email = { "hong@naver.com", "kim@naver.com", "lee@naver.com", "park@naver.com", "choi@naver.com" };
	
	Random r = new Random();

	public String getRName() {
		return name[r.nextInt(5)];
	}

	public int getRAge() {
		return age[r.nextInt(5)];
	}

	public String getRTel() {
		return tel[r.nextInt(5)];
	}

	public String getRAddr() {
		return addr[r.nextInt(5)];
	}

	public String getREmail() {
		return email[r.nextInt(5)];
	}
	
	public AddrBook getABook() {
		return new AddrBook(
				getRName(),
				getRAge(),
				getRTel(),
				getRAddr(),
				getREmail());
	}
	
	
}
