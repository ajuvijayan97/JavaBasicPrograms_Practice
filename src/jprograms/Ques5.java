package jprograms;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int reverse = 0, lastdigit;
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		while(n>0) {
			lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n = n / 10;
			
			
		}
		 System.out.println("Reversed number: " + reverse);

	}

}
