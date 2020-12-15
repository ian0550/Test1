import java.util.Scanner;

public class IF8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("연도를 입력하세요: ");
		int year = s.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("윤년입니다. ");
		}
	}

}
