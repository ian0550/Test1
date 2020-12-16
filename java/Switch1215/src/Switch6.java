import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------");
		System.out.println("간단한 계산기 프로그램 v1.0");
		System.out.println("----------------------");
		System.out.println("1. Num1 입력 => ");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println("2. Num2 입력 => ");
		int num2 = s.nextInt();
		System.out.println("3. 연산자 입력 => ");
		String op = s.next();
		
		switch (op) {
		case "+" : 
			System.out.printf("%d %s %d = %d\n", (int)num1, op, (int)num2, (int)(num1+num2));
			break;
		case "-" : 
			System.out.printf("%d %s %d = %d\n", (int)num1, op, (int)num2, (int)(num1-num2));
			break;
		case "8" : 
			System.out.printf("%d %s %d = %d\n", (int)num1, op, (int)num2, (int)(num1*num2));
			break;
		case "/" : 
			System.out.printf("%d%s%d = %d\n", (int)num1, op, (int)num2, (int)(num1/num2));
			break;
		}
		s.close();
	}

}
