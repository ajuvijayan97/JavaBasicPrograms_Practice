package mthds;

public class Shapes {

	public static void main(String[] args) {
		
		Shapes ob = new Shapes();
		
		ob.triangle();
		
		ob.rectangle(5,4);
		
		double c  = ob.circle();
		System.out.println(c);
		
		int s = ob.square(5);
		System.out.println(s);
	
	}
	
	//without return type and parameter
	public void triangle() {
		double b = 5, h = 10;
		double triangleArea = 0.5 * b * h;
		System.out.println(triangleArea);
	}
	
	//without returntype and with parameters
	public void rectangle(int l, int b) {
		int rectangleArea = l * b;
		System.out.println(rectangleArea);
	}
	
	//with returntype and without parameter
	public double circle() { 
		double r = 5;
		double circleArea = 3.14 * r * r;
		return circleArea;
	}
	
	//without returntype and with parameters
	public int square(int a) {
		int squareArea = a * a;
		return squareArea;
	}
}
