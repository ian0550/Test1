package method1230;


public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("func() ȣ�� ��");
		func(); //�޽�� ���(ȣ��)
		System.out.println("func() ȣ�� ��");
		
		System.out.println("�ݺ��� �޽�� ȣ��");
		for (int i = 0; i < 5; i++) {
			func();
		}
	}
	
	//�޽�� ����(����)
	public static void func() {
		System.out.println("�޽�� ���");
	}

}
