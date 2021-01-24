
public class Method_10 {

	public static void main(String[] args) {
		int num2 = 20; 
		func(num2);
		System.out.println("main() num2 : " + num2);

	}
	public static void func(int num2) {
		num2 = num2;
		System.out.println("func() num2 : " + num2);
	}

	
		
    public static void main2(String[] args) {
        int num3 = 15;
        func2(num3);
        System.out.println("main2() num3 : " + num3);
    }
    
    public static void func2(int num3) {
    	num3 = num3;
    	System.out.println("func2() num3 : " + num3);
    }
}
	

