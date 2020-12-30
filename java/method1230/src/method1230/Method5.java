package method1230;

public class Method5 {

	public static void divide(int num1, int num2) {
		//num1 : 분자, num2 : 분모
		if(num2 ==0) {
			System.out.println("0으로 나눌 수 없습니다.");
//			System.exit(0);
			//void method에서 return을 사용하면 메쏘드 종료
			//System.exit(0); 프로그램 강제 종료
			//return;현재 실행 중인 메쏘드 탈출
			return;
		}
		System.out.println("나눗셈 결과 : " + (num1/num2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(4,2);
		divide(4,0);
		System.out.println("메인() 종료");
	}

}
