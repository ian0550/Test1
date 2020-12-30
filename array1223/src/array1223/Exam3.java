package array1223;

import java.util.Random;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------");
		System.out.println("간단한 로또 프로그램 v1.1");
		System.out.println("---------------------------------------------");

		int lottoArr[] = new int[6];
		for (int i = 0; i < 6; i++) {
			int lotto = (int) (Math.random() * 6) + 1;
			System.out.println("로또번호 : " + lotto);

			lottoArr[i] = lotto;
			for (int j = 0; j < i; j++) {
				if (lottoArr[j] == lottoArr[i]) {
					System.out.println("중복발생");
					i--;
					break;

				}
			}
		}
//		Random rand = new Random();
//		int[] n = new int[6];
//		for (int i = 0; i < 6; i++) {
//			n[i] = rand.nextInt(6) + 1;
//			for (int j = 0; j < i; j++) {
//				if (n[j] == n[i]) {
//					i--;
//				}
//			}
//		}
		for (

				int i = 0; i < lottoArr.length; i++) {
			System.out.println(lottoArr[i]);
		}
	}
}
