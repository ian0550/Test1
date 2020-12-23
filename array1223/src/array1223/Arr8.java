package array1223;

public class Arr8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.printf("arr[%d] : %d\n",i, arr[i]);
		}
		System.out.println("------------------------------");
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] % 5 == 0) {
				System.out.println(arr[i]);
			}
			if (i == 90) {
				System.out.printf("break: arr[%d] = %d",i, arr[i]);
				break;
			}

		}
	}

}
