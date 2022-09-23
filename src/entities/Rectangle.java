package entities;

public class Rectangle {
	public double a;
	public double b;

	public double area() {
		double p = a * b;
		return p;
	}

	public double perimeter() {
		double p1 = (a + b) * 2;
		return p1;
	}

	public double diagonal() {
		double p2 = a * a + b * b;
		return Math.sqrt(p2);
	}
}
