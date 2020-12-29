import java.util.Arrays;
import java.util.Scanner;


public class csharp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("몇 개의 값을 입력 받을지 적으세요: ");
        int arr = s.nextInt();
        int[] arry = new int[arr];
        
        for (int i = 0; i < arry.length; i++) {
        	System.out.println("숫자를 입력해주세요.");
			arry[i] = s.nextInt();
		}

		Arrays.sort(arry);
		
        System.out.printf("최소값 : %d, 최대값 : %d", arry[0], arry[arr-1]);
	}

}
