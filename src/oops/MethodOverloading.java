package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add();
		obj.add(30,50);
		obj.add(40,40.7);

	}
	public void add() {
		int a = 10, b = 30;
		int c = a + b;
		System.out.println(c);
	}
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	public void add(int a, double b) {
		double c = a + b;
		System.out.println(c);
	}
}
