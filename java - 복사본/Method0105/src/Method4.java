import java.util.Scanner;

public class Method4 {
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
	
	public static int oper(int a, int b, String op) {
		int result = 0;
		switch(op) {
		case "+" :
			result = a+b;
			break;
		case "-" :
			result = a-b;
			break;
		case "*" :
			result = a*b;
			break;
		case "/" :
			result = a/b;
			break;
		}
		return result;
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

	public static int[] Lotto(int arr[]) {
		int lotto[] = new int[5];
		for (int i = 0; i < 5; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j <= i; j++) {
				if (lotto[i] == lotto[j] && i != j) {
					lotto[j] = (int) (Math.random() * 45 + 1);
					i = 0;
				}

			}

		}
		return lotto;
	}
	
	public static int[] Hap(int arr[]) {
		int hol = 0, jjack = 0;
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				jjack += i;
			}else {
				hol += i;
			}
		}
		int holjjack[] = {hol, jjack};
		return holjjack;
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
	
	public static int Pack(int a) {
		int pack = 1;
		for (int i = 1; i <= a; i++) {
			pack *= i;
		}
		return pack;
	}
	
	public static int[][] hackjum(int a[][]) {
		int stu[][] = new int[3][5];
		
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu[i].length; j++) {
				int sco = (int) (Math.random() * 100) + 1;
				stu[i][j] = sco;
			}
		}
		return stu;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.3.4.5.8
		int a = (int) (Math.random() * 100) + 1;
		int b = (int) (Math.random() * 100) + 1;
		int c = (int) (Math.random() * 100) + 1;
		int d = (int) (Math.random() * 100) + 1;
		System.out.println("1번문제-----------------");
		System.out.printf(" %d, %d, %d, %d -> ", a, b, c, d);
		int arr[] = new int[] { a, b, c, d };
		sort(arr);

		System.out.println("\n\n");
		System.out.println("2번문제-----------------");
		Scanner s = new Scanner(System.in);
		System.out.printf("연산자를 입력해주세요 : ");
		String op = s.next();
		int result = 0;
		result = oper(a,b,op);

		System.out.printf("리턴값 출력 : %d %s %d = %d \n", a, op, b, result);
		
		System.out.println("\n\n3번문제------------------");
		for (int i = 0; i < 10; i++) {
			a = (int) (Math.random() * 100) + 1;
			System.out.println((i + 1) + "번째 = " + a);
			HolJJack(a);
		}

		System.out.println("\n\n4번문제------------------");
		int kuk = (int) (Math.random() * 100) + 1;
		int eng = (int) (Math.random() * 100) + 1;
		int mat = (int) (Math.random() * 100) + 1;
		System.out.printf("국어: %d,영어: %d,수학: %d \n", kuk, eng, mat);
		jumsu(kuk, eng, mat);

		System.out.println("\n\n5번문제------------------");
		a = (int) (Math.random() * 9) + 1;
		gugu(a);

		System.out.println("\n\n6번문제------------------");
		int lotto[] = {};
		int bunho[] = Lotto(lotto);
		System.out.println("로또번호 : ");
		
		for (int i = 0; i < bunho.length; i++) {
			System.out.print(bunho[i] + " ");
		}
		
		System.out.println("\n\n7번문제------------------");
		int hap1[] = {}; 
		int hap2[] = Hap(hap1);
		System.out.println("홀수 :" + hap2[0] + " 짝수 : " + hap2[1]);
		
		System.out.println("\n\n8번문제------------------");
		gugu2();
		
		System.out.println("\n\n10번문제------------------");
		System.out.printf("숫자를 입력해주세요 : ");
		int pa = s.nextInt();
		Pack(pa);
		System.out.println(pa + "! = " + Pack(pa) +"\n\n");
		
		System.out.println("\n\n11번문제------------------");
		int stu[][] = new int[3][5];
		
		for (int i = 0; i < hap2.length; i++) {
			for (int j = 0; j < hap2.length; j++) {
				int sco = (int) (Math.random() * 100) + 1;
				stu[i][j] = sco;
			}
		}
		
		short num1 = 22;
       short num2 = 11;
       result = num1+num2;
       System.out.println(result);
       int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = n-i-1; j >0  ; j--) {
				System.out.printf("-");
			}
			for (int k = 0; k < i*2+1; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		int hap=0;
		for (int i = 0; i < 100; i++) {
			if(i%2 != 0) {
				hap += i;
			}
		}
		System.out.println(hap);
	}

}
