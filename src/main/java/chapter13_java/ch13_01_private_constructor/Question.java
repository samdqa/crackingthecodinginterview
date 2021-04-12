package chapter13_java.ch13_01_private_constructor;

public class Question {
	private Question() {
		System.out.println("Q");
	}
	
    static class A {
        private A() {
        }
    }

    static class B extends A {
    	public B() {
    	}
    }
    
	public static void main(String[] args) {
		new B();
	}

}
