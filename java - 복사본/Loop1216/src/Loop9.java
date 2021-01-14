import java.util.Scanner;

public class Loop9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------");
		System.out.println("짝수, 홀수 구분 프로그램 v1.0");
		System.out.println("----------------------------");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d. Num%d =>", i+1, i+1);
			int num1 = s.nextInt();

			if (num1 % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
		int i=0;
		System.out.println("----------------------------");
		System.out.println("짝수, 홀수 구분 프로그램 v1.0");
		System.out.println("----------------------------");
		while(i<5) {
			System.out.printf("%d. Num%d =>", i+1, i+1);
			int num1 = s.nextInt();
			if (num1 % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			i++;
		}
		
		System.out.println("----------------------------");
		System.out.println("짝수, 홀수 구분 프로그램 v1.0");
		System.out.println("----------------------------");
		i = 0;
		do {
			System.out.printf("%d. Num%d =>", i + 1, i + 1);
			int num1 = s.nextInt();
			if (num1 % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			i++;
		} while (i < 5);
	}

}
