package sigleTone;

public class SingleTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		인스턴스 객체 사용
//		SingleTest si1 = new SingleTest();
//		si1.getData();
//		new SingleTest().getData(); //위에 두 줄 합친 것
		System.out.println("-----------------------");
		System.out.println("인스턴스 객체 생성");
		System.out.println("-----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(new SingleTest().getData());
			
		}
//		singletone 사용
		System.out.println("-----------------------");
		System.out.println("싱글톤 객체 생성");
		System.out.println("-----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(SingleTest.getInstance().getData());
			
		}
	}

}
