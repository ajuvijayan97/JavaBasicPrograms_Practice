package mthds;

public class Calc {
	public static void main(String[] args) {
		Calc ob = new Calc();
		
		//without returntype and w/o parameter
		ob.add();
		
		//without returntype and with parameter
		ob.sub(30,20);
		
		//with returntype and without parameters
		int mult = ob.mul();
		System.out.println(mult);
		
		//with returntype and with parameters
		double d  = ob.div(50, 6);
		System.out.println(d);
		
		
		
	}
	public void add() { //without returntype and w/o parameters
		int a = 10, b = 20;
		int sum = a + b;
		System.out.println(sum);
	}
	
	public void sub(int a, int b) { //without returntype and with parameters
		int subresult = a - b;
		System.out.println(subresult);
	}
	
	public int mul(){ //with returntype and without parameters
		int a = 5, b = 4;
		int mulresult = a * b;
		return mulresult;
		
	}
	
	public double div(int a, int b) { //with returntype and with parameters
		double divresult = a/b;
		return divresult;
		
	}

}
