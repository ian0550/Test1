import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		double op1 = s.nextDouble();
		System.out.print("연산식 입력 : ");
		String oper = s.next();
		System.out.print("두번째 숫자 입력 : ");
		double op2 = s.nextDouble();
		double result = 0;
		
		switch (oper) {
		case "+":
			result = op1 + op2;
			break;
		case "-":
			result = op1 - op2;
			break;
		case "*":
			result = op1 * op2;
			break;
		case "/":
			if (op2 == 0) {
				System.out.println("분모 0 에러!");
				s.close();
				//실행 프로그램 강제 종료
				System.exit(0);
			}
			result = op1 / op2;
			break;
		default:
			System.out.println("잘못된 연산자 입력");
			s.close();
			System.exit(0);
		}
		System.out.println(result);
		s.close();
	}

}
