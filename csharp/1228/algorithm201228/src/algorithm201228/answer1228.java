package algorithm201228;

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
		
	}

}
