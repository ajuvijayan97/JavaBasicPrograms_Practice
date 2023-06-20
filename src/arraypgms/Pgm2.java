package arraypgms;

import java.util.Scanner;

public class Pgm2 {

	public static void main(String[] args) {
		int ar[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		for(int i = 0; i <= 2; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Entered nums:");
		for(int i = 0; i <= 2; i++) {
			System.out.println(ar[i]);
		}

	}

}
