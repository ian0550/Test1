package com.ia.serialApp.handler;

import java.util.Scanner;

public class serialCtrl {
	public static final String ADMIN_ID = "admin";
	public static final String GUEST_ID = "guest";
	public static final String ADMIN_PW = "1234";
	public static final String GUEST_PW = "1111";
	public static final String ADMIN_MODE = "admin_mode";
	public static final String GUEST_MODE = "guest_mode";
	public static final String OTHER_MODE = "other_mode";
	
	public String login(Scanner s) {
		System.out.println("-----------------");
		System.out.println("스마트홈 제어 로그인");
		System.out.println("-----------------");
		System.out.print("ID: ");
		String id = s.next();
		System.out.print("PW: ");
		String passwd = s.next();
		String mode;

		if (id.equals(ADMIN_ID) && 
			passwd.equals(ADMIN_PW)) {
			mode = ADMIN_MODE;
		} else if (id.equals(GUEST_ID) && 
			passwd.equals(GUEST_PW)) {
			mode = GUEST_MODE;
		} else {
			mode = OTHER_MODE;
		}
		return mode;
	}
}
