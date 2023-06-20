package jprograms;

import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int num = sc.nextInt();
        
        int temp = num; int sum = 0;
        while(num > 0){
            int d = num % 10;
            sum = sum + (d * d * d);
            num = num / 10;
        }
        
        if(temp == sum){
            System.out.println(temp + " is an Armstrong number.");
        } 
        else{
            System.out.println(temp + " is not an Armstrong number.");
        }

	}

}
