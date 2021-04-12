package chapter13_java.ch13_06_reflections;

public class Rectangle {
	private double width;
	private double height;
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double area() {
		return width * height;
	}
}
