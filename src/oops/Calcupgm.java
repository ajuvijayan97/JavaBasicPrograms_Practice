package oops;

import java.util.Scanner;

public class Calcupgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+': result = num1 + num2;
                System.out.println(result);
                break;

            case '-': result = num1 - num2;
                System.out.println(result);
                break;

            case '*': result = num1 * num2;
                System.out.println(result);
                break;

            case '/':if (num2 == 0) {
                System.out.println("Error");
                return;
            }
            result = num1 / num2;
            break;
            default:System.out.println("Invalid");
                break;
        }

	}
	
}


