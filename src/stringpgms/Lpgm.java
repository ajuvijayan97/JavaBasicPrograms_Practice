package stringpgms;

import java.util.Scanner;

public class Lpgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        if(st.contains("Java")) {
            System.out.println("The string contains the word 'Java'");
        } 
        else {
            System.out.println("The string does not contain the word 'Java'");
        }

	}

}
