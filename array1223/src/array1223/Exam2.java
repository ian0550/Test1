package array1223;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {
			final String last[] = { "김", "박", "이", "최", "장", "하" };
			final String first[] = { "바", "사", "아", "자", "차", "이" };
			final String mid[] = { "가", "나", "다", "라", "마", "안" };
			System.out.println("----------------------");
			System.out.println("메뉴 프로그램 테스트 1.0");
			System.out.println("----------------------");
			System.out.println("1. 파일 생성 및 쓰기");
			System.out.println("2. 파일 읽기");
			System.out.println("3. 프로그램 종료");
			System.out.println("----------------------");
			System.out.println("메뉴 선택 : ");
			int menu = s.nextInt();
			String fileName = "d:/test1.txt";

			switch (menu) {
			case 1:
				BufferedOutputStream bs = null;
				bs = new BufferedOutputStream(new FileOutputStream(fileName));
				String fullName[] = new String[50];
				for (int i = 0; i < fullName.length; i++) {
					int rand = (int)(Math.random()*5);
					fullName[i] = last[(int)(Math.random()*6)] + mid[(int)(Math.random()*6)] + first[(int)(Math.random()*6)];
					bs.write(fullName[i].getBytes());
					bs.write("/".getBytes());
					//System.out.println(fullName[i]);
				}
				bs.close();
				System.out.println("파일 저장 성공!");
				break;
			case 2:
				String str = "홍길동/김길동/최길동/";
				StringTokenizer stk = new StringTokenizer(str, "/");
				while (stk.hasMoreTokens()) {
					System.out.println(stk.nextToken());
				}
				break;
			case 3:
				// 프로세스 : 실행중인 프로그램
				// 프로세서 : CPU
				s.close();
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 메뉴 선택!");
				break;
			}

		}

	}

}
