package jprograms;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;
        System.out.print("Enter integers : ");
        int num = sc.nextInt();
        System.out.println("The number you entered are: ");
        for(int i = 0; i < num; i++) {
        	System.out.println("Enter the number: " + i);
        	if(i % 2 == 0) {
        		even = even + num;
        	}
        	else {
        		odd = odd + num;
        	}
        }

        System.out.println("Sum of even integers: " + even);
        System.out.println("Sum of odd integers: " + odd);
   
	}

}
