package array1223;

public class Arr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,34,22,14,36,23,67,25,99,88};
		int hap=0;
		for (int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.printf("hap : %d, ��� : %d", hap, hap/arr.length);
	}

}
