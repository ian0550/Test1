import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("1.�� ������ �Է� :");
		Circle circle = new Circle(s.nextInt());
		System.out.println(circle.getArea());
		
		System.out.println("2.�⵵ �Է� : ");
		zodiac zo = new zodiac();
		System.out.println("3.");
		Student std[] = new Student[2];
		std[0] = new Student("�̵���","2009038033", "��");
		std[1] = new Student("������","2007012034", "��");
		for (int i = 0; i < std.length; i++) {
			std[i].showStdInfo();
		}
		System.out.println("-------------�̵����л� �й� ����----------");
		std[0].setHackbun("2019038033");
		for (int i = 0; i < std.length; i++) {
			std[i].showStdInfo();
		}
		System.out.println("4.���ڿ� �Է� : ");
		String a = s.next();
		String moonja[] = a.split("");
		new Alphabet(moonja);
		
		System.out.println("4-1.���ڿ� �Է� : ");
		String aa = s.next();
		String moonja1[] = aa.split("");
        new Alphabet2(moonja1);
		System.out.println();
        System.out.print("5.���ڿ� �Է� : ");
        String str = s.next();
		new AlphaNum(str);
	}
}
