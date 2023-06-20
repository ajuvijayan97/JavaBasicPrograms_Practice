package arraypgms;

import java.util.Scanner;

public class Pgm4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter Numbers: ");

        for (int i = 0; i < 5; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            sum += ar[i];
        }

        average = (double) sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
	}

}
