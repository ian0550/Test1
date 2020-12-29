package dArray1229;

public class Arr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2},
				{2,4},
				{3,6},
				{4,8},
				{5,10}
		};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d",i,j,arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		int value = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = value++;
			}
		}
		value = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (value++)*10;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		int gugu[][] = new int[9][9];
		for (int i = 0; i < gugu.length; i++) {
			for (int j = 0; j < gugu[i].length; j++) {
				gugu[i][j] = (i+2)*(j+1);
				System.out.printf((j+2)+"X"+(i+1)+"="+(i+1)*(j+2)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("간단한 로또 프로그램 v1.1");
		System.out.println("---------------------------------------------");
		
		int lotto[] = new int[5];
		for (int i = 0; i < 5; i++) {
			lotto[i] = (int)(Math.random()*5+1);
			for (int j = 1; j <= i; j++) {
				
				if(lotto[i] == lotto[j] && i!=j) {
					lotto[i] = (int)(Math.random()*5+1);
				}
				
			}
			
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}
