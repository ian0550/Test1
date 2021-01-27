package thread0127;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		t1.start(); //t1 ������ ��ü ���� ����
		t2.start(); //t2 ������ ��ü ���� ����
		// ������� t1, t2 ���� ����
		for (int i = 0; i < 10; i++) {
			System.out.println("main ������ ������");
			Thread.sleep(1000);
		}
		System.out.println("���� ������ ����");
	}

}

class MyThread extends Thread {
	String str;
	
	public MyThread(String str) {
		this.str = str;
	}
	
	// �����ε� : �ߺ�����
	// �������̵� : �θ��� ���� ������
	// work(�۾�) ������� �����ϴ� �κ�(run)
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			//1000ms = 1��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�۾� ������ ����");
	}
}
