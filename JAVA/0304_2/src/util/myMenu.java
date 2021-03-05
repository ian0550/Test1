package util;

import java.util.Scanner;

	public class myMenu {
		public int menu(Scanner s) {
			System.out.println("--------------------");
			System.out.println(" MySQL DB 관리 v1.0 ");
			System.out.println("--------------------");
			System.out.println("1. 테이블 생성");
			System.out.println("2. 테이블 삭제");
			System.out.println("3. 데이터 추가");
			System.out.println("4. 데이터 보기");
			System.out.println("5. 랜덤 데이터 추가");
			System.out.println("6. 데이터 수정");
			System.out.println("7. 데이터 삭제");
			System.out.println("8. 프로그램 종료");
			System.out.println("--------------------");
			System.out.println("메인 메뉴 선택");
			return s.nextInt();
		}
}
