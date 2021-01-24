package sigleTone;

public class SingleTest {
	private static SingleTest inst; //객체에서 생성X, 클래스에서만 생성되는 변수(클래스 변수)
	private int data;
	
	public SingleTest() {
		// TODO Auto-generated constructor stub
		data = (int)(Math.random()*100);
	}
	
//	class method
	public static SingleTest getInstance() {
		if (inst == null) {
			inst = new SingleTest();
		}
		return inst;  //한번 만들어진 객체를 재사용
	}
	
	public int getData() {
		return data;
	}
}
