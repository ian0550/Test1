import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Loop14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br;
		
		System.out.println("-------------------------------");
		System.out.println("간단한 파일 관리 프로그램 v1.0");
		System.out.println("-------------------------------");
		System.out.println("1. 파일 생성 및 쓰기");
		System.out.println("2. 파일 읽기");
		System.out.println("3. 종료");
		System.out.println("-------------------------------");
		System.out.println("메뉴를 선택하세요 :");
		Scanner s = new Scanner(System.in);
		int menu = s.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1. 파일 생성 및 쓰기 \n 파일명 : test1.txt \n");
			BufferedOutputStream bs;
			try {
				bs = new BufferedOutputStream(new FileOutputStream("d:/test1.txt"));
				String str = "파일 생성 및 쓰기 예제입니다.";
				bs.write(str.getBytes());
				bs.close();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		case 2:
			System.out.println("2. 파일 읽기 \n 파일명 : test1.txt \n");
			try {
				br = new BufferedReader(new FileReader(new File("d:/test1.txt")));
				String str = br.readLine();
				System.out.println("---파일에서 내용 읽어오기---");
				System.out.println(str);
				br.close();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		case 3:
			System.out.println("종료");
			System.exit(0);
		}
	}

}
