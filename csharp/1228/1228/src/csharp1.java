import java.util.Arrays;
import java.util.Scanner;


public class csharp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("�� ���� ���� �Է� ������ ��������: ");
        int arr = s.nextInt();
        int[] arry = new int[arr];
        
        for (int i = 0; i < arry.length; i++) {
        	System.out.println("���ڸ� �Է����ּ���.");
			arry[i] = s.nextInt();
		}

		Arrays.sort(arry);
		
        System.out.printf("�ּҰ� : %d, �ִ밪 : %d", arry[0], arry[arr-1]);
	}

}
