package class0113;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println("----------------------");
		System.out.println(car.JIJUM);
		System.out.println("----------------------");
		car.showCarInfo();
		
		Car car2 = new Car("그랜저", "현대", "흰색", "3천만원");
		car2.showCarInfo();
	}
}
