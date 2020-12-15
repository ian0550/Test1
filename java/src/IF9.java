import java.util.Scanner;

public class IF9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
		System.out.println("학점 관리 프로그램 v1.0");
		System.out.println("---------------------------");
		System.out.println("100 ~ 90 : A학점");
		System.out.println("89 ~ 80 : B학점");
		System.out.println("79 ~ 70 : C학점");
		System.out.println("69 ~ 60 : D학점");
		System.out.println("59 ~ 0  : F학점");
		System.out.println("---------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("국어 점수 입력: ");
		int kor = s.nextInt();
		System.out.println("영어 점수 입력: ");
		int eng = s.nextInt();
		System.out.println("수학 점수 입력: ");
		int math = s.nextInt();
		int hap = kor + eng + math;
		System.out.println("총점: " + hap);
		int ave = hap / 3;
		System.out.println("평균: " + ave);
		
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
		s.close();
		
	}

}
