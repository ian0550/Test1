import java.util.Scanner;

public class Switch7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------");
		System.out.println("담배 자판기 프로그램 v1.0");
		System.out.println("-------------------------------");
		System.out.println("원하는 담배를 메뉴에서 선택하세요.\n");
		System.out.println("1. 에쎄 골드 리프   6,000원");
		System.out.println("2. 에쎄 스페셜 골드  5,000원");
		System.out.println("3. 더원 블루       4,500원");
		System.out.println("4. 더원 오렌지     4,500원");
		System.out.println("5. 더원 화이트     4,500원 \n");
		System.out.println("-------------------------------");
		System.out.print("담배를 선택 하세요 =>");
		Scanner s = new Scanner(System.in);
		int smoke = s.nextInt();

		String smoke1 = null;
		int money = 0;
		switch (smoke) {
		case 1:
			System.out.println("에쎄 골드 리프를 선택하셨습니다.");
			smoke1 = "에쎄 골드 리프";
			money = 6000;
			break;
		case 2:
			System.out.println("에쎄 스페셜 골드를 선택하셨습니다.");
			smoke1 = "에쎄 스페셜 골드";
			money = 5000;
			break;
		case 3:
			System.out.println("더원 블루를 선택하셨습니다.");
			smoke1 = "더원 블루";
			money = 4500;
			break;
		case 4:
			System.out.println("더원 오렌지를 선택하셨습니다.");
			smoke1 = "더원 오렌지";
			money = 4500;
			break;
		case 5:
			System.out.println("더원 화이트를 선택하셨습니다.");
			smoke1 = "더원 화이트";
			money = 4500;
			break;
		default:
			System.out.println("선택한 값이 없습니다.");
			System.exit(0);
			break;
		}
		System.out.println("-------------------------------");
		System.out.println("담배 금액을 입금하세요 =>");
		int money1 = s.nextInt();
		int namg = money1 - money;

		if (namg > 0) {
			System.out.printf("%s를 구매했습니다. 거스름돈 %d원을 받으세요.\n", smoke1, (int) (money1 - money));
		} else if (namg == 0) {
			System.out.printf("%s를 구매했습니다.", smoke1);
		} else {
			// (namg*(-1)) -> Math.abs() 절대값을 만드는 메소드
			System.out.println("추가금액 " + Math.abs(namg) + "원 을 투입하세요.");
		}

		s.close();
	}

}
