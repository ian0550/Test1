package method1230;

import java.util.Scanner;

public class Method7 {

	public static void sort(int arr[]) {
		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
				i = 0;
			} else {
				i++;
				if (i == arr.length)
					break;
			}
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.printf(arr[j] + " ");
		}
	}

	public static void HolJJack(int a) {
		if (a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

	public static void jumsu(int a, int b, int c) {
		int hap = a + b + c;
		int pyeng = (a + b + c) / 3;
		System.out.printf("합계 : %d, 평균 : %d ", hap, pyeng);
	}

	public static void gugu(int a) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d \n", a, i, (i * a));
		}
	}

	public static void gugu2() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (j % 2 != 0) {
					System.out.printf("%d X %d = %d \t", j, i, (i * j));
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.3.4.5.8
//		int a = (int) (Math.random() * 100) + 1;
//		int b = (int) (Math.random() * 100) + 1;
//		int c = (int) (Math.random() * 100) + 1;
//		int d = (int) (Math.random() * 100) + 1;
//		System.out.println("1번문제-----------------");
//		System.out.printf(" %d, %d, %d, %d -> ", a, b, c, d);
//		int arr[] = new int[] { a, b, c, d };
//		sort(arr);
//
//		System.out.println("\n\n3번문제------------------");
//		for (int i = 0; i < 10; i++) {
//			a = (int) (Math.random() * 100) + 1;
//			System.out.println((i + 1) + "번째 = " + a);
//			HolJJack(a);
//		}
//
//		System.out.println("\n\n4번문제------------------");
//		int kuk = (int) (Math.random() * 100) + 1;
//		int eng = (int) (Math.random() * 100) + 1;
//		int mat = (int) (Math.random() * 100) + 1;
//		System.out.printf("국어: %d,영어: %d,수학: %d \n", kuk, eng, mat);
//		jumsu(kuk, eng, mat);
//
//		System.out.println("\n\n5번문제------------------");
//		a = (int) (Math.random() * 9) + 1;
//		gugu(a);
//
//		System.out.println("\n\n8번문제------------------");
//		gugu2();
//		
//		short num1 = 22;
//       short num2 = 11;
//       int result = num1+num2;
//       System.out.println(result);
//       int n = 5;
//		for (int i = 0; i < n; i++) {
//			for (int j = n-i-1; j >0  ; j--) {
//				System.out.printf("-");
//			}
//			for (int k = 0; k < i*2+1; k++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		int hap=0;
//		for (int i = 0; i < 100; i++) {
//			if(i%2 != 0) {
//				hap += i;
//			}
//		}
//		System.out.println(hap);
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자입력 : ");
		int num1 = s.nextInt();
		System.out.println("두번째 숫자입력 : ");
		int num2 = s.nextInt();
		
		for (int i = 0; i < num1; i++) {
			if(i%num2 == 0) {
				hap += i;
			}
		}
		System.out.println(hap);
		
		
	}

}
