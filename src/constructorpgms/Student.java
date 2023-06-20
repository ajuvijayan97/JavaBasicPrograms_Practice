package constructorpgms;

public class Student {

			int studentId;
		    String studentName;
		    String institution = "Luminar Technlolab";
		    
		    public Student(int studentId, String studentName) {
		        this.studentId = studentId;
		        this.studentName = studentName;
		     }
		    
		    public void display() {
		        System.out.println("Student ID: " + this.studentId);
		        System.out.println("Student Name: " + this.studentName);
		     }
		    
		    public static void main(String[] args) {
		        // Create a new Student object
		        Student student1 = new Student(101, "Akhil");
		        
		        // Display the details of the student
		        student1.display();
		   }
	}





