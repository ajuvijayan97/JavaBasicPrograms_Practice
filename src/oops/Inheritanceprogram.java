package oops;


	class Member {
		String name, address;
		int age;
		long phonenumber,salary;
		 
		public void printDetails() {
			System.out.println("Name:" +name);
			System.out.println("Age:" +age);
			System.out.println("Phone Number:" +phonenumber);
			System.out.println("Address:" +address);
			System.out.println("Salary:" +salary);
		}
		
	}
	
	class Employee extends Member {
		String specialization;
	}
	
	class Manager extends Member {
		String department;
	}
	
public class Inheritanceprogram {

	public static void main(String[] args) {
		
		Employee ob = new Employee();
		ob.name ="Akhil";
		ob.age = 25;
		ob.address ="Kollam";
		ob.phonenumber = 98765432;
		ob.salary = 23000;
		
		System.out.println(ob.specialization = "Nodejs");
		ob.printDetails();
		
		Manager manager = new Manager();
		manager.name = "Prajeesh";
		manager.age = 25;
		manager.address = "Thrissur";
		manager.phonenumber = 98765412;
		manager.salary = 35000;
		
		System.out.println(manager.department = "Developing Team");
		manager.printDetails();
		
	}

}
