import javax.swing.event.SwingPropertyChangeSupport;

public class Alphabet {
	public Alphabet(String moonja[]) {
		for (int i = 0; i < moonja.length; i++) {
			switch (moonja[i]) {
			case "a": 
				System.out.printf("��");
				break;
			case "b": 
				System.out.printf("��");
				break;
			case "c": 
				System.out.printf("��");
				break;
			case "d": 
				System.out.printf("��");
				break;
			case "e": 
				System.out.printf("��");
				break;
			case "f": 
				System.out.printf("��");
				break;
			case "g": 
				System.out.printf("��");
				break;
			case "h": 
				System.out.printf("��");
				break;
			case "i": 
				System.out.printf("��");
				break;
			case "j": 
				System.out.printf("��");
				break;
			case "k": 
				System.out.printf("��");
				break;
			case "l": 
				System.out.printf("��");
				break;
			case "m": 
				System.out.printf("��");
				break;
			case "n": 
				System.out.printf("��");
				break;
			case "o": 
				System.out.printf("��");
				break;
			case "p": 
				System.out.printf("��");
				break;
			case "q": 
				System.out.printf("��");
				break;
			case "r": 
				System.out.printf("��");
				break;
			case "s": 
				System.out.printf("��");
				break;
			case "t": 
				System.out.printf("��");
				break;
			case "u": 
				System.out.printf("��");
				break;
			case "v": 
				System.out.printf("��");
				break;
			case "w": 
				System.out.printf("��");
				break;
			case "x": 
				System.out.printf("��");
				break;
			default:
				throw new IllegalArgumentException("���� �����Դϴ�.");
			}
		}
		System.out.println();
	}
	
}
