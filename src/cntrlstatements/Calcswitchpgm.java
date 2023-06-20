package cntrlstatements;

public class Calcswitchpgm {

	public static void main(String[] args) {
		int a = 15, b = 10;
		String operator = "Modulus";
				switch(operator) {
				case "Addition" :System.out.println(a + b);
				break;
				case "Subtraction" :System.out.println(a - b);
				break;
				case "Multiplication" :System.out.println(a * b);
				break;
				case "Division" :System.out.println(a / b);
				break;
				default : System.out.println("Invalid");
				}

	}

}
