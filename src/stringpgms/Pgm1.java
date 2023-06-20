package stringpgms;

public class Pgm1 {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Welcome";
		String s2 = "Hello. How are you.";
		System.out.println(s.concat(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s2.contains("are"));
		System.out.println(s2.startsWith("Hello"));
		System.out.println(s2.endsWith("Hello"));
		System.out.println(s.length());
		System.out.println(s2.substring(2,6));
		System.out.println(s.charAt(1));
		String [] sr = s2.split(" ");
		for(String v : sr) {
			System.out.println(v);
		}
		

	}

}
