import java.util.Scanner;

public class Method_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int year = s.nextInt();
		System.out.print("�� �Է� : ");
		int month = s.nextInt();
		System.out.print("�� �Է� : ");
		int day = s.nextInt();
		mysort(year, month, day);
	}
	
	public static void mysort(int a, int b, int c) {
		if (a > b && b > c) {
			System.out.println(a+"�� "+b+"�� "+c+"��");
		}
	}
}


