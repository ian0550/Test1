import java.util.Scanner;

public class Method_14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���丮�� �� �Է� : ");
		int n = s.nextInt();
        
		int result = factorial(n);
		System.out.println(n + "!=" + result);
	}
	public static int factorial(int n) {
		if (n == 1) {
		return 1;
	}
		else {
			return n * factorial(n-1);
		}

}
}
