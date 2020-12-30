package method1230;

public class Method2 {
	

	public static void func() {
		System.out.println("func() 사용");
		func1();
	}

	public static void func1() {
		System.out.println("func1() 사용");
		func2();
	}
	
	public static void func2() {
		System.out.println("func2() 사용");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func();
	}
}
