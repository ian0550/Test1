import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Loop4 {

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
			switch (menu) {
			case 1:
				BufferedOutputStream bs = null;
				String str = null;
				String fileName = "d:/test1.txt";
				try {
					bs = new BufferedOutputStream(new FileOutputStream(fileName));
					str = "파일 생성 및 쓰기 예제입니다.";
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
