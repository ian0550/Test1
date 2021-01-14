import java.util.Scanner;

public class Loop13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
		System.out.println("간단 구구단 프로그램 v1.0");
		System.out.println("---------------------------");
		System.out.println("구구단 입력 => ");
		Scanner s = new Scanner(System.in);
		int gugu = s.nextInt();
		
		for(int i =0; i<9; i++) {
			System.out.printf("%d X %d = %d \n",gugu, i+1, gugu*(i+1));
		}
		System.out.println();
		System.out.println("구구단 입력 => ");
		gugu = s.nextInt();
		int i =0;
		while(i<9) {
			System.out.printf("%d X %d = %d \n",gugu, i+1, gugu*(i+1));
			i++;
		}
		
		i=0;
		System.out.println();
		System.out.println("구구단 입력 => ");
		gugu = s.nextInt();
		do {
			System.out.printf("%d X %d = %d \n",gugu, i+1, gugu*(i+1));
			i++;
		}while(i<9);
	}

}
