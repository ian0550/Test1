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
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	}

	public static void jumsu(int a, int b, int c) {
		int hap = a + b + c;
		int pyeng = (a + b + c) / 3;
		System.out.printf("�հ� : %d, ��� : %d ", hap, pyeng);
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
		int a = (int) (Math.random() * 100) + 1;
		int b = (int) (Math.random() * 100) + 1;
		int c = (int) (Math.random() * 100) + 1;
		int d = (int) (Math.random() * 100) + 1;
		System.out.println("1������-----------------");
		System.out.printf(" %d, %d, %d, %d -> ", a, b, c, d);
		int arr[] = new int[] { a, b, c, d };
		sort(arr);

		System.out.println("\n\n3������------------------");
		for (int i = 0; i < 10; i++) {
			a = (int) (Math.random() * 100) + 1;
			System.out.println((i + 1) + "��° = " + a);
			HolJJack(a);
		}

		System.out.println("\n\n4������------------------");
		int kuk = (int) (Math.random() * 100) + 1;
		int eng = (int) (Math.random() * 100) + 1;
		int mat = (int) (Math.random() * 100) + 1;
		System.out.printf("����: %d,����: %d,����: %d \n", kuk, eng, mat);
		jumsu(kuk, eng, mat);

		System.out.println("\n\n5������------------------");
		a = (int) (Math.random() * 9) + 1;
		gugu(a);

		System.out.println("\n\n8������------------------");
		gugu2();
	}

}
