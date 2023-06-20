package oops;

import java.util.Scanner;

public class Scannerpgm {
	public static void main(String[] args) {
		System.out.println("Enter a num:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Entered num:" + a);
	}

}
