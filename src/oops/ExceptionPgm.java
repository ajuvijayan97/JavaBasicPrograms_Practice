package oops;

public class ExceptionPgm {

	public static void main(String[] args) {
		
		
		//runtime exception
		
		try {
			
		
		int a[] = new int[2];
		a[0] = 23; a[1] = 34;
		System.out.println(a[3]);
		
		}
		
		catch(Exception e) {
			System.out.println("ArrayIndexOutException");
		}
		
		try {
			
			
		int a = 20; int b = 0;
		int c = a / b;
		 System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Arithmetic Exception");
		}
		
		
		
		try {
			String s = null;
		    System.out.println(s.length());
		} 
		
		catch (NullPointerException e) {
		    System.out.println("NullPointerException");
		}
		
		
		
		
		
		

		
	}

}
