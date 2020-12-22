
public class Loop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------");
		System.out.println("5의 배수 출력 프로그램 v1.0");
		System.out.println("---------------------");
		for (int i = 0; i < 101; i++) {
			if (i % 5 == 0 && i != 0 && i != 100) {
				System.out.printf(i + ",");
			}else if(i==100) {
				System.out.println(i);
			}
		}
		int i = 0;
		while (i < 101) {
			if (i % 5 == 0 && i != 0 && i != 100) {
				System.out.printf(i + ",");
			}else if(i==100) {
				System.out.println(i);
			}
			i++;
		}
		
		i =0;
		do {
			if (i % 5 == 0 && i != 0 && i != 100) {
				System.out.printf(i + ",");
			}else if(i==100) {
				System.out.println(i);
			}
			i++;
		}while(i<101);
	}

}
