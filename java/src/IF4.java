import java.util.Scanner;

public class IF4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력 : ");
		int num = s.nextInt();
		
		if (100 >= num && num >= 90) {
			System.out.println("A학점");
		}
		else if (89 >= num && 80 <= num) {
			System.out.println("B학점");
		}
		else {
			System.out.println(" A, B제외 학점"); 
		}
	}

}
