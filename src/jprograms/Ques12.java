package jprograms;

import java.util.Scanner;

public class Ques12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;
        int num;

        System.out.println("Enter numbers (type any String/Character to stop): ");
        while (sc.hasNextInt()) { /* sc.hasNextInt is a method used to check whether 
        the input entered through the scanner object sc is an integer or not. */
            num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zero: " + zero);
    }
	
}


