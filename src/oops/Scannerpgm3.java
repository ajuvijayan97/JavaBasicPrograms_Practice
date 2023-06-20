package oops;

import java.util.Scanner;

public class Scannerpgm3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        //String name = sc.next();
        char c =sc.next().charAt(1);
        System.out.println(c);

	}

}
