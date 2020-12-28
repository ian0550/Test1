package algorithm201228;

import java.util.Scanner;

public class answer1228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1번 문제");
		Scanner s = new Scanner(System.in);
		System.out.println("총 몇 개의 숫자 받을래?");
		int countNum = s.nextInt();
		System.out.println("이제 숫자들을 입력받자");
		
		int[] numberList = new int[countNum];
		for (int i = 0; i < countNum; i++) {
			numberList[i] = s.nextInt();
		}
		
	}

}
