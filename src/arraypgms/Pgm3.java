package arraypgms;

import java.util.Scanner;

public class Pgm3 {

	public static void main(String[] args) {
		String ar[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Names:");
		for(int i = 0; i <= 4; i++) {
			ar[i] = sc.nextLine();
		}
		System.out.println("Entered Names:");
		for(int i = 0; i <= 4; i++) {
			System.out.println(ar[i]);
		}

	}

}
