import java.util.Random;

public class Loop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		System.out.println("간단한 로또 프로그램 v1.0");
		System.out.println("--------------------");
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			int num = rand.nextInt(45) + 1;
			System.out.print(num + " ");
		}
		System.out.println();
		int i = 0;
		while (i < 5) {
			int num = rand.nextInt(45) + 1;
			System.out.print(num + " ");
			i++;
		}

		i = 0;
		System.out.println();
		do {
			int num = rand.nextInt(45) + 1;
			System.out.print(num + " ");
			i++;
		} while (i < 5);
	}

}
