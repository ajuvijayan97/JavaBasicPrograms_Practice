package jprograms;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		int n, a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms : ");
        n = sc.nextInt();
        
        System.out.print("Fibonacci Series of " + n + " terms: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int s = a + b;
            a = b;
            b = s;
        }

	}

}
