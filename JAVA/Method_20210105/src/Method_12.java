import java.util.Scanner;

public class Method_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = s.nextInt();
		System.out.print("월 입력 : ");
		int month = s.nextInt();
		System.out.print("일 입력 : ");
		int day = s.nextInt();
		mysort(year, month, day);
	}
	
	public static void mysort(int a, int b, int c) {
		if (a > b && b > c) {
			System.out.println(a+"년 "+b+"월 "+c+"일");
		}
	}
}


