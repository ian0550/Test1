import java.util.Scanner;

public class IF6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------");
		System.out.println("홀짝 판단 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("숫자입력 => ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num % 2 != 0) {
			System.out.println("입력한 숫자는 홀수입니다.");
		} else {
			System.out.println("입력한 숫자는 짝수입니다.");
		}

		System.out.println("-----------------------");
		System.out.println("대소 비교 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("num1 입력 => ");
		int num1 = s.nextInt();
		System.out.println("num2 입력 => ");
		int num2 = s.nextInt();

		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다.");
		} else if (num1 < num2) {
			System.out.println("num2가 num1보다 크다.");
		} else {
			System.out.println("num1과 num2는 같다.");
		}

		System.out.println("-----------------------");
		System.out.println("간단한 계산기 프로그램 v1.0");
		System.out.println("-----------------------");

		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

		System.out.println("-----------------------");
		System.out.println("간단한 계산기 프로그램 v1.1");
		System.out.println("-----------------------");

		System.out.println("연산자 입력 => ");
		String buho = s.next();

		if (buho.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (buho.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (buho.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if (buho.equals("/")) {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		}

		System.out.println("-----------------------");
		System.out.println("년도별 윤년 구분 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("년도 입력 => ");
		int year = s.nextInt();

		if ((year % 4 == 0 && year / 100 != 0) || (year / 400 == 0)) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}

		System.out.println("-----------------------");
		System.out.println("학점 관리 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("100 ~ 90 : A학점");
		System.out.println("89 ~ 80 : B학점");
		System.out.println("79 ~ 70 : C학점");
		System.out.println("69 ~ 60 : D학점");
		System.out.println("59 ~ 50 : E학점");
		System.out.println("49 ~ 0 : F학점");
		System.out.println("-----------------------");
		System.out.println("국어 점수 입력 => ");
		int kuk = s.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = s.nextInt();
		System.out.println("수학 점수 입력 => ");
		int mat = s.nextInt();
		int hap = kuk + eng + mat;
		int ave = hap / 3;
		System.out.println("총점 " + hap);
		System.out.println("평균 " + ave);

		if (ave <= 100 && ave >= 90) {
			System.out.println("학점은 A입니다.");
		} else if (ave >= 80 && ave < 90) {
			System.out.println("학점은 B입니다.");
		} else if (ave >= 70 && ave < 80) {
			System.out.println("학점은 C입니다.");
		} else if (ave >= 60 && ave < 70) {
			System.out.println("학점은 D입니다.");
		} else if (ave >= 50 && ave < 60) {
			System.out.println("학점은 E입니다.");
		} else {
			System.out.println("학점은 F입니다.");
		}
	}

}
