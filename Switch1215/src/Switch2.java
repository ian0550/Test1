import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("월(1~12)을 입력 : ");
		
		int month = s.nextInt();
		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄입니다. ");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
		case 12: case 1: case 2:
			System.out.println("겨울입니다.");
		default :
			System.out.println("잘못된 입력!");
		}
		s.close();
	}

}
