package array1223;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("----------------------");
			System.out.println("메뉴 프로그램 테스트 1.0");
			System.out.println("----------------------");
			System.out.println("1. 파일 생성 및 쓰기");
			System.out.println("2. 파일 읽기");
			System.out.println("3. 프로그램 종료");
			System.out.println("----------------------");
			System.out.println("메뉴 선택 : ");
			int menu = s.nextInt();
			String last[] = { "김", "박", "이", "최", "장", "하" };
			String first[] = { "바", "사", "아", "자", "차", "이" };
			String mid[] = { "가", "나", "다", "라", "마", "안" };
			String name[] = new String[50];

			for (int i = 0; i < name.length; i++) {
				String la = (last[new Random().nextInt(last.length)]);
				String fi = (first[new Random().nextInt(first.length)]);
				String mi = (mid[new Random().nextInt(mid.length)]);
				String fullname = la + fi + mi;

				name[i] = fullname;
				// System.out.printf("name[%d] : %s \n", i, fullname);
			}
			switch (menu) {
			case 1:
				BufferedOutputStream bs = null;
				String str = "";
				String fileName = "d:/test1.txt";
				try {
					bs = new BufferedOutputStream(new FileOutputStream(fileName));
					for (int i = 0; i < name.length; i++) {
						str += (name[i] + "/");
					}
//					String str = "홍길동#김길동#최길동#";
//					StringTokenizer stk = new StringTokenizer(str, "#");
//					while (stk.hasMoreTokens()) {
//						System.out.println(stk.nextToken());
//					}
					bs.write(str.getBytes());
					bs.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("파일명 : " + fileName);
				System.out.println("파일내용 : " + str);
				System.out.println("파일 생성이 완료되었습니다.");
				break;
			case 2:
				System.out.println("2. 파일 읽기");
				String str1 = "";
				try {
					// 파일 객체 생성
					File file = new File("d:/test1.txt");
					// 스캐너로 파일 읽기
					Scanner scan = new Scanner(file);
					while (scan.hasNextLine()) {
						str1 = scan.nextLine();
						System.out.println(scan.nextLine());
					}
					// System.out.println(scan.useDelimiter("\\z").next());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					// TODO: handle exception
				}

				StringTokenizer stk = new StringTokenizer(str1, "/");
				while (stk.hasMoreTokens()) {
					System.out.println(stk.nextToken());
				}
				
				break;
			case 3:
				System.out.println("3. 프로그램 종료");
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
