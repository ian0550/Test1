package com.ia.serialApp.util;

import java.util.Scanner;

import com.ia.serialApp.network.Myserial;

import jssc.SerialPort;
import jssc.SerialPortException;

public class Menu {
	public static final int MENU_TV_ON = 1;
	public static final int MENU_TV_OFF = 2;
	public static final int MENU_HEATER_ON = 3;
	public static final int MENU_CLEANER_ON = 4;
	public static final int MENU_GUEST_LOGOUT = 5;
	public static final int MENU_ADMIN_LOGOUT = 7;
	public static final int MENU_GUEST_EXIT = 6;
	public static final int MENU_ADMIN_RECONN = 6;
	public static final int MENU_ADMIN_EXIT = 8;
	public static final int MENU_EMARGENCY = 5;
	
	static final int CMD_TV_ON 		= '1';
	static final int CMD_TV_OFF 	= '0';
	static final int CMD_HEATER_ON 	= '2';
	static final int CMD_CLEANER_ON = '3';
	
	public static int adminMenu(Scanner s) {
		System.out.println("------------------");
		System.out.println("스마트홈 제어 관리자");
		System.out.println("------------------");
		System.out.println("1.TV 켜기");
		System.out.println("2.TV 끄기");
		System.out.println("3.보일러 동작");
		System.out.println("4.세탁기 동작");
		System.out.println("5.긴급 정지");
		System.out.println("6.통신 재연결");
		System.out.println("7.로그아웃");
		System.out.println("8.종료");
		System.out.println("------------------");
		System.out.print("메뉴 선택: ");
		return s.nextInt();
	}
	
	public static int guestMenu(Scanner s) {
		System.out.println("------------------");
		System.out.println("스마트홈 제어 사용자");
		System.out.println("------------------");
		System.out.println("1.TV 켜기");
		System.out.println("2.TV 끄기");
		System.out.println("3.보일러 동작");
		System.out.println("4.세탁기 동작");
		System.out.println("5.로그 아웃");
		System.out.println("6.종료");
		System.out.println("------------------");
		System.out.print("메뉴 선택: ");
		return s.nextInt();
	}
	
	public boolean adminWork(Scanner s, 
			SerialPort serial) {
			switch (adminMenu(s)) {
			case MENU_TV_ON:
				System.out.println("TV 켜기");
				try {
					serial.writeInt(CMD_TV_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;
			case MENU_TV_OFF:
				System.out.println("TV 끄기");
				try {
					serial.writeInt(CMD_TV_OFF);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;
			case MENU_HEATER_ON:
				System.out.println("보일러 가동");
				try {
					serial.writeInt(CMD_HEATER_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;
			case MENU_CLEANER_ON:
				System.out.println("세탁기 가동");
				try {
					serial.writeInt(CMD_CLEANER_ON);
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;
			case MENU_EMARGENCY:
				System.out.println("긴급 정지");
				try {
					serial.closePort();
				} catch (SerialPortException e) {
					e.printStackTrace();
				}
				break;
			case MENU_ADMIN_RECONN:
				System.out.println("통신 재연결");
				if (!serial.isOpened()) {
					new Myserial().openSerial(serial);
				}
				break;
			case MENU_ADMIN_LOGOUT:
				System.out.println("관리자 로그 아웃");
				return false;
			case MENU_ADMIN_EXIT:
				System.out.println("프로그램 종료");
				s.close();
				System.exit(0);
			}
			return true;
		}
		
		public static boolean guestWork(Scanner s, 
				SerialPort serial) {
			switch (guestMenu(s)) {
			case MENU_TV_ON:
				System.out.println("TV 켜기");
				break;
			case MENU_TV_OFF:
				System.out.println("TV 끄기");
				break;
			case MENU_HEATER_ON:
				System.out.println("보일러 가동");
				break;
			case MENU_CLEANER_ON:
				System.out.println("세탁기 가동");
				break;
			case MENU_GUEST_LOGOUT:
				System.out.println("사용자 로그 아웃");
				return false;
			case MENU_GUEST_EXIT:
				System.out.println("프로그램 종료");
				s.close();
				System.exit(0);
			}
			return true;
		}
}
