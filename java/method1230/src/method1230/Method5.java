package method1230;

public class Method5 {

	public static void divide(int num1, int num2) {
		//num1 : ����, num2 : �и�
		if(num2 ==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
//			System.exit(0);
			//void method���� return�� ����ϸ� �޽�� ����
			//System.exit(0); ���α׷� ���� ����
			//return;���� ���� ���� �޽�� Ż��
			return;
		}
		System.out.println("������ ��� : " + (num1/num2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(4,2);
		divide(4,0);
		System.out.println("����() ����");
	}

}
