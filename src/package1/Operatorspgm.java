package package1;

public class Operatorspgm {

	public static void main(String[] args) {
     // Arithmetic operators
        int a = 20, b = 13;
        System.out.println(a + b); 
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); 
        
     //Assignment operators
        float x = 43, y = 38;
       System.out.println("x+=y: "+(x+=y));
       System.out.println("x-=y: "+(x-=y));
       System.out.println("x*=y: "+(x*=y));
        
     // Relational operators
        System.out.println(a < b);
        System.out.println(a > b); 
        System.out.println(a == b); 
        System.out.println(a <= b); 
        System.out.println(a >= b);
        System.out.println(a != b); 
        
      // Logical Operator
        
        String username = "Prajeesh";
        String password = "xyzqwer";
        System.out.println(username=="Prajeesh" && password=="xyzqwer");
        System.out.println(username=="Prajeesh" || password=="xyzqwer");
        System.out.println(!(username=="Prajeesh"));
        
       //Unary operator
         
        int d = 7;
        System.out.println(d++);
        System.out.println(d);
        System.out.println(--d); 
        System.out.println(d);
        System.out.println(d--);
        System.out.println(d);
        System.out.println(++d);
        System.out.println(d);
	}

}
