package cntrlstatements;

public class Whilepgm2 {

	public static void main(String[] args) {
		int n = 3456;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

}


