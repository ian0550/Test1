
public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int i = 0;
		while (i<10) {
			i++;
			hap += i;
		}
		System.out.println("1~10까지의 합: " + hap);
		
		hap = 0;
		i = 0;
		
		do {
			hap += (i+1);
			i++;
		} while (i<10);
		System.out.println("1~10까지의 합: " + hap);
	}

}
