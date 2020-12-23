package array1223;

public class Arr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int arr1[] = new int[10];
		
//		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[(arr.length-1)-i]; 
			System.out.printf("arr1[%d] = %d\t",i,arr1[i]);
			System.out.printf("arr[%d] = %d \n", i, arr[i]);
		}
	}
}
