import java.util.Random;

public class JaSeup0119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("선택정렬--------------------------");
		Select();
		System.out.println("random--------------------------");
		Select2();
		System.out.println("버블정렬--------------------------");
		buble();
		System.out.println("삽입정렬--------------------------");
		Insert();
		System.out.println("삽입정렬2--------------------------");
		Insert2();
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
	
	public static void buble() {
		int temp = 0;
		int buble[] = {8,5,6,2,4};
//		int buble[] = new int[5];
//		for (int i = 0; i < 5; i++) {
//			buble[i] =(int)(Math.random()*100+1);
//			System.out.printf(buble[i] + " ");
//		}
		
		for (int i = 0; i < buble.length; i++) {
			int chk = 0;
			for (int j = 0; j < buble.length-(i+1); j++) {
				if(buble[j] > buble[j+1]) {
					temp = buble[j];
					buble[j] = buble[j+1];
					buble[j+1] = temp;
					chk++;
				}
			}
			if(chk == 0) {
				continue;
			}
			System.out.printf(i+1 + "회전 :");
			for (int j = 0; j < buble.length; j++) {
				System.out.printf(buble[j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void Insert() {
		int temp = 0;
		int ins[] = {8,5,6,2,4};
		
		for (int i = 1; i < ins.length; i++) {
			int chk = 0;
			for (int j = i-1; j >= 0; j--) {
				temp = ins[i-chk];
				if(temp < ins[j]) {
					temp = ins[j];
					ins[j] = ins[j+1];
					ins[j+1] = temp;
					chk++;
				}
			}
			System.out.printf(i + "회전 :");
			for (int j = 0; j < ins.length; j++) {
				System.out.printf(ins[j] + " ");
			}
			System.out.println();
			
		}
	}

	public static void Insert2() {
		int temp = 0;
		int ins[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			ins[i] =(int)(Math.random()*100+1);
			System.out.printf(ins[i] + " ");
		}
		System.out.println();
		
		for (int i = 1; i < ins.length; i++) {
			int chk = 0;
			for (int j = i-1; j >= 0; j--) {
				temp = ins[i-chk];
				if(temp < ins[j]) {
					temp = ins[j];
					ins[j] = ins[j+1];
					ins[j+1] = temp;
					chk++;
				}
			}
			System.out.printf(i + "회전 :");
			for (int j = 0; j < ins.length; j++) {
				System.out.printf(ins[j] + " ");
			}
			System.out.println();
		}
	}
}
