
public class Switch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math 수학 클래스
		// (0 ~ 3) + 8 사이 숫자 랜덤값 나옴
		int time = (int)(Math.random()*4) + 8;
		System.out.println("현재 시간 : " + time);
		
		switch (time) {
		case 8 :
			System.out.println("출근");
		case 9 :
			System.out.println("회의");
		case 10 :
			System.out.println("업무");
		default :
			System.out.println("출장");
		
		}
	}

}
