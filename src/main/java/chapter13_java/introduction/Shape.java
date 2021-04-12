package chapter13_java.introduction;

public abstract class Shape {
	public void printMe() {
		System.out.println("I am a shape.");
	}
	
	public abstract double computeArea();
}
