package constructorpgms;

import java.util.Scanner;

public class Sumofintegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = sumOfInteger(n);
        System.out.println("Sum: " + sum);
    }

    public static int sumOfInteger(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }

        return sum;

	}

}
