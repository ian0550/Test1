package serial0216_1;

import java.io.IOException;
import java.util.Scanner;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;
//import serial_0210.ReadThread;
//import serial_0210.WriteThread;

public class SerialMain {
	static final int TV_ON = 1;
	static final int TV_OFF = 2;
	static final int HOTTER_ON = 3;
	static final int CLEANER_ON = 4;
	static final int PROGRAM_EXIT = 5;

	static final int CMD_TV_ON = '1';
	static final int CMD_TV_OFF = '0';
	static final int CMD_HOTTER_ON = '2';
	static final int CMD_CLEANER_ON = '3';
	
	public static int getMenu(Scanner s) {
		System.out.println("-----------------------");
		System.out.println(" 스마트 홈 제어 v1.0");
		System.out.println("-----------------------");
		System.out.println("1.TV 켜기");
		System.out.println("2.TV 끄기");
		System.out.println("3.보일러 동작");
		System.out.println("4.세탁기 동작");
		System.out.println("5.종료");
		System.out.println("-----------------------");
		System.out.println("메뉴 선택 : ");
//		int menu = s.nextInt();
//		return menu;
		return s.nextInt();
	}
	
	public static SerialPort initSerial() {
		String[] portName = SerialPortList.getPortNames();
		for (int i = 0; i < portName.length; i++) {
			System.out.println("사용가능 포트 : " + portName[i]);
		}
		SerialPort serialPort = new SerialPort(portName[0]);
		
		try {
			serialPort.openPort(); //통신준비
			serialPort.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE); //통신 초기화
			System.out.println("포트 사용 가능!");
		} catch (SerialPortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return serialPort;
		
	}
	
	public static void main(String[] args) {
//		initSerial();
		SerialPort serial = initSerial();
		Scanner s = new Scanner(System.in);
		while (true) {
			switch (getMenu(s)) {
			case TV_ON:
				System.out.println("TV_ON");
				try {
					serial.writeInt(CMD_TV_ON);
				} catch (SerialPortException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case TV_OFF:
				System.out.println("TV_OFF");
				try {
					serial.writeInt(CMD_TV_OFF);
				} catch (SerialPortException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case HOTTER_ON:
				System.out.println("보일러 가동");
				try {
					serial.writeInt(CMD_HOTTER_ON);
				} catch (SerialPortException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case CLEANER_ON:
				System.out.println("세탁기 가동");
				try {
					serial.writeInt(CMD_CLEANER_ON);
				} catch (SerialPortException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case PROGRAM_EXIT:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
		}
	}
}
//class ReadThread extends Thread {
//	SerialPort serial;
//	
//	public ReadThread(SerialPort serial)	{
//		this.serial = serial;
//	}
//	@Override
//	public void run() {
//		while (true) {
//			byte[] read;
//			try {
//				read = serial.readBytes();
//				if(read != null && read.length > 0) {
//					System.out.print(new String(read));
//				}
//			} catch (SerialPortException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//	}
//	
//}
//
//class WriteThread extends Thread {
//	SerialPort serial;
//	
//	public WriteThread(SerialPort serial) {
//		this.serial = serial;
//	}
//	
//	public void run() {
//		int c = 0;
//		try {
//			while ((c=System.in.read()) > -1) {
//				serial.writeInt(c);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SerialPortException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}


