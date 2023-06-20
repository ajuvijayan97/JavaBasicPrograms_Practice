package stringpgms;

import java.util.Scanner;

public class Vowelspgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        int count = 0;
        for(int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        
        System.out.println("vowels count : " + count);

	}

}
