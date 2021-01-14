import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("원하는 구구단 입력: ");
		int gugu = s.nextInt();
		
		for(int i=0; i<9; i++) {
			System.out.printf("%d * %d = %d\n", gugu, i+1, gugu*(i+1));
			System.out.println(gugu + "x" + (i+1) + "=" + gugu*(i+1));
		}
	}

}
