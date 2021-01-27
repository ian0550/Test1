package thread0127;

import java.awt.Toolkit;

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = new BeepTask();
		Thread th = new Thread(task);
		th.start();
	}

}

// implements : 상속X, 기능 추가
// Runnable 인터페이스를 사용
// Interface는 반드시 오버라이딩 필요 (상속은 필요에 따라 재정의 할 수도 안 할 수도)
class BeepTask implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("작업쓰레드 :" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("작업 쓰레드 종료");
	}
	
}
