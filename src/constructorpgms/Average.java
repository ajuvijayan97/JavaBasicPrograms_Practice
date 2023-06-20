package constructorpgms;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();
        double average = averageOfNums(num1, num2, num3);
        System.out.println("Average is: " + average);
    }

    public static double averageOfNums(double num1, double num2, double num3) {
    	double avg = (num1 + num2 + num3)/3;
        return avg;

	}

}
