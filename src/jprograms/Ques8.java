package jprograms;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ":");
            int input = sc.nextInt();
            sum = sum + input;
        }

        double average = (double) sum / 10;
        System.out.println("average is : " + average);

	}

}
