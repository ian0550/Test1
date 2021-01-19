import java.util.Random;

public class JaSeup0119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("선택정렬--------------------------");
		Select();
		System.out.println("random--------------------------");
		Select2();
	}
	
	public static void Select() {
		int select[] = {8, 5, 6, 2, 4};
		int temp = 0;
		
		for (int i = 0; i < select.length; i++) {
			for (int j = (i+1); j < select.length; j++) {
				if (select[i] >= select[j]) {
					temp = select[i];
					select[i] = select[j];
					select[j] = temp;
					i = i;
				}
			}
			if (i == select.length-1) {
				continue;
			}
			System.out.printf(i+1 + "회전 :");
			for (int k = 0; k < select.length; k++) {
				System.out.print(select[k] + " ");
			}
			System.out.println();
		}
	}
	
	public static void Select2() {
		int temp = 0;
		int select2[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			select2[i] =(int)(Math.random()*100+1);
			System.out.printf(select2[i] + " ");
		}
		System.out.println(
				);
		for (int i = 0; i < select2.length; i++) {
			for (int j = (i+1); j < select2.length; j++) {
				if (select2[i] >= select2[j]) {
					temp = select2[i];
					select2[i] = select2[j];
					select2[j] = temp;
					i = i;
				}
			}
			if (i == select2.length-1) {
				return;
			}
			System.out.printf(i+1 + "회전 :");
			for (int k = 0; k < select2.length; k++) {
				System.out.print(select2[k] + " ");
			}
			System.out.println();
		}
	}

}
