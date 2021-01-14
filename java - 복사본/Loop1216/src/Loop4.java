

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int hap = 0;
		System.out.println("숫자 입력: ");
		int num = s.nextInt();
		
		for (int i=0; i<num; i++) {
			hap += (i+1);
		}
		System.out.println("1~" + num + "까지의 합: " + hap);
		System.out.printf("1~%d까지의 합: %d", num, hap);
	}

}
