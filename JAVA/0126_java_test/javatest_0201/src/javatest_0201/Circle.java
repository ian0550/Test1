package javatest_0201;

public class Circle {
	double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	
	public double getArea() {
		return (rad * rad) * PI;
	}
	
	public void setRad(double r) {
		if( r<0 ) {
			rad = 0;
			return;
		}
		rad = r;
	}
	
	public double getRad() {
		return rad;
	}
}
