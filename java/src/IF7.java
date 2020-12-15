import java.util.Scanner;

public class IF7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Num1 입력 => ");
		double op1 = s.nextDouble();
		System.out.println("Num2 입력 => ");
		double op2 = s.nextDouble();
		System.out.println("연산자 입력(+,-,*,/) ");
		String oper = s.next();
		double result = 0;
		
		if (oper.equals("+")) {
			result = op1 + op2;
		}
		else if (oper.equals("-")) {
			result = op1 - op2;
		}
		else if (oper.equals("*")) {
			result = op1 * op2;
		}
		else if (oper.equals("/")) {
			result = op1 / op2;
		}
		System.out.println((int)op1 + oper + (int)op2 + "=" + (int)result);
		// %d : 정수, %s : 문자열
		// \n : 뉴라인, \t : 탭키 삽입
		System.out.printf("%d %s %d = %d\n", (int)op1, oper, (int)op2, (int)result);
		
		s.close();
	}

}
