
public class Loop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		for (int i=0; i<10; i++) {
			//3으로 나눈 나머지가 0
			// --> 3의 배수
			if ((i+1) % 3 == 0) {
				//반복문 처음으로 이동
				continue;
			}
			System.out.println("i+1: " + (i+1));
			hap += (i+1);
			
			if((i+1)==5) {
				System.out.println("탈출");
				break;
			}
		}
		System.out.println("1~10까지 3의 배수를 제외한 합: " + hap);
	}

}
