package oops;

import java.util.Scanner;

public class Palindromepgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int reverse = 0, lastdigit;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;

        while(n > 0) {
            lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n = n / 10;
        }

        if (temp == reverse) {
            System.out.println("It is a palindrome.");
        } 
        else {
            System.out.println("It is not a palindrome.");
        }

	}

}
