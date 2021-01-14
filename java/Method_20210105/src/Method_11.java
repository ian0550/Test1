import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Method_11 {

	    public static int ave(int num1, int num2, int num3) {
		int result = 0;
		result = (num1 + num2 + num3) / 3;
		return result;
		
	
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int num1 = s.nextInt();
		System.out.print("영어점수 : ");
		int num2 = s.nextInt();
		System.out.print("수학점수 : ");
		int num3 = s.nextInt();
		
		int ave = ave(num1, num2, num3);
		
		
		System.out.println("ave : " + ave);
		
        
	
	}
}

	
	

    

