package array1223;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int[] arr = new int[3];
			int hap = 0;
			
			for (int i = 0; i <3; i++) {
				System.out.println((i+1)+"번째 숫자 입력 : ");
				arr[i] = s.nextInt();
			}
//			System.out.println("1번째 숫자 입력 : ");
//			arr[0] = s.nextInt();
//			System.out.println("2번째 숫자 입력 : ");
//			arr[1] = s.nextInt();
//			System.out.println("3번째 숫자 입력 : ");
//			arr[2] = s.nextInt();
//			
//			hap = arr[0] + arr[1] + arr[2];
//			System.out.println("배열의 합: " + hap);
			
			for (int i = 0; i < 3; i++) {
				hap += arr[i];
			}
			System.out.println("�迭�� ��: " + hap);
			s.close();
			
	}

}
