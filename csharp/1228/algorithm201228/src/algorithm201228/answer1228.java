package algorithm201228;

import java.util.Arrays;
import java.util.Scanner;

public class answer1228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1�� ����");
		Scanner s = new Scanner(System.in);
		System.out.println("�� �� ���� ���� ������?");
		int countNum = s.nextInt();
		System.out.println("���� ���ڵ��� �Է¹���");
		
		int[] numberList = new int[countNum];
		for (int i = 0; i < countNum; i++) {
			numberList[i] = s.nextInt();
		}
		
		//�ִ� �ּ� ��
		//ù��° ���
		int max = numberList[0];
		int min = numberList[0];
		
		for (int i = 0; i < numberList.length; i++) {
			if(numberList[i] > max)
				max = numberList[i];
			if(numberList[i] < min)
				min = numberList[i];
		}
		System.out.println("�ּҰ� : " + min);
		System.out.println("�ִ밪 : " + max);
		
		//�ι�° ���
		Arrays.sort(numberList);
		System.out.println("�ּҰ� : " + numberList[0]);
		System.out.println("�ִ밪 : " + numberList[numberList.length-1]);
	}

}
