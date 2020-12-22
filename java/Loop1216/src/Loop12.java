import java.util.Scanner;

public class Loop12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------");
		System.out.println("입력받는 수의 합을 구하는 프로그램 v1.0");
		System.out.println("---------------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("1. Num1 입력 => ");
		int num1 = s.nextInt();
		System.out.println("2. Num2 입력 => ");
		int num2 = s.nextInt();
		int hap = 0;
		while (num1 >= num2) {
			System.out.println("Num1과 Num2가 같거나 Num2가 Num1보다 작습니다. 다시 입력해주세요. ");
			System.out.println("2. Num2 입력 => ");
			num2 = s.nextInt();
		}
		for (int i = num1; i <= num2; i++) {
			hap += i;
		}
		System.out.printf("%d~%d까지의 합 : %d", num1, num2, hap);
		System.out.println();

		System.out.println("---------------------------------");
		System.out.println("입력받는 수의 합을 구하는 프로그램 v1.0");
		System.out.println("---------------------------------");
		System.out.println("1. Num1 입력 => ");
		num1 = s.nextInt();
		System.out.println("2. Num2 입력 => ");
		num2 = s.nextInt();
		hap = 0;
		while (num1 >= num2) {
			System.out.println("Num1과 Num2가 같거나 Num2가 Num1보다 작습니다. 다시 입력해주세요. ");
			System.out.println("2. Num2 입력 => ");
			num2 = s.nextInt();
		}
		int a = num1;
		while (num1 <= num2) {
			hap += num1;
			num1++;
		}
		System.out.printf("%d~%d까지의 합: %d ", a, num2, hap);
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("입력받는 수의 합을 구하는 프로그램 v1.0");
		System.out.println("---------------------------------");
		System.out.println("1. Num1 입력 => ");
		num1 = s.nextInt();
		System.out.println("2. Num2 입력 => ");
		num2 = s.nextInt();
		hap = 0;
		while (num1 >= num2) {
			System.out.println("Num1과 Num2가 같거나 Num2가 Num1보다 작습니다. 다시 입력해주세요. ");
			System.out.println("2. Num2 입력 => ");
			num2 = s.nextInt();
		}
		a = num1;
		do {
			hap += num1; 
			num1 ++;
		}while(num1 <= num2);
		System.out.printf("%d~%d까지의 합: %d ", a, num2, hap);

	}

}
