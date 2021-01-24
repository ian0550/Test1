import java.util.Random;

public class Method_13 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			//System.out.println(arr[i]);
		}
		evenOdd(arr);
		

	}
	public static void evenOdd(int arr[]) {
		for (int i : arr) {
			if (i % 2 != 0) {
				System.out.println(i+"= È¦¼ö");
			}
			else {
				System.out.println(i+"= Â¦¼ö");
			}
		}
	}

}
