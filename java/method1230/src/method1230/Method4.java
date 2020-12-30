package method1230;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		func(num);
		System.out.println("main() num : " + num);
	}
	
	public static void func(int num) {
		num = num + 1;
		System.out.println("func() num : " + num);
	}
}
