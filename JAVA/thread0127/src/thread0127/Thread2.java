package thread0127;

import java.awt.Toolkit;

public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeepThread beep = new BeepThread();
		// �۾������� ����
		beep.start();

		//���� ������ ����
		for (int i = 0; i < 5; i++) {
			System.out.println("���ξ����� ���� : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���ξ����� ����");
	}

}

//�����带 ����ϱ� ���ؼ��� run()�� �ݵ�� �������̵� �ʿ�.
class BeepThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("�۾������� :" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�۾� ������ ����");
	}
	
	
}