package thread0127;

public class Thread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		Thread th = new MovieThread();
		th.start();
		
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
		th.interrupt();
	}

}

class MovieThread extends Thread {
	
	public void run() {
		while (true) {
			System.out.println("������ ���");
//			if(isInterrupted()) {
//				System.out.println("���ͷ�Ʈ ��ȣ ����");
//				break;
//			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("���ͷ�Ʈ ��ȣ ����2");
				e.printStackTrace();
				break;
			}
		}
		System.out.println("�۾� ������ ����");
	}
}
