package algorithm201228;

import java.util.Arrays;
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
		
		//최대 최소 비교
		//첫번째 방법
		int max = numberList[0];
		int min = numberList[0];
		
		for (int i = 0; i < numberList.length; i++) {
			if(numberList[i] > max)
				max = numberList[i];
			if(numberList[i] < min)
				min = numberList[i];
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
		//두번째 방법
		Arrays.sort(numberList);
		System.out.println("최소값 : " + numberList[0]);
		System.out.println("최대값 : " + numberList[numberList.length-1]);
	}

}
