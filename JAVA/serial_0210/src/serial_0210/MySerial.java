package serial_0210;

import java.io.IOException;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class MySerial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		ReadThread rt = new ReadThread(serialPort);
		rt.start();
		WriteThread wt = new WriteThread(serialPort);
		wt.start();
//		try {
//			serialPort.closePort();
//		} catch (SerialPortException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}

class ReadThread extends Thread {
	SerialPort serial;
	
	public ReadThread(SerialPort serial)	{
		this.serial = serial;
	}
	@Override
	public void run() {
		while (true) {
			byte[] read;
			try {
				read = serial.readBytes();
				if(read != null && read.length > 0) {
					System.out.print(new String(read));
				}
			} catch (SerialPortException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

class WriteThread extends Thread {
	SerialPort serial;
	
	public WriteThread(SerialPort serial) {
		this.serial = serial;
	}
	
	public void run() {
		int c = 0;
		try {
			while ((c=System.in.read()) > -1) {
				serial.writeInt(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SerialPortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}