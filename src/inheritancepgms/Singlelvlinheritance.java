package inheritancepgms;

	class Animal {
		public void food() {
			System.out.println("Food");
		}
	}
	
	class Dog extends Animal {
		public void breed() {
			System.out.println("Rottweiler");
		}
	}
	
	class Babydog extends Dog {
		public void babydogfeature() {
			System.out.println("Babydog");
		}
	}
	
	
public class Singlelvlinheritance {

	public static void main(String[] args) {
		
		Dog ob = new Dog();
		ob.food();
		ob.breed();
		
		Babydog baby = new Babydog();
		baby.food();
		baby.breed();
		baby.babydogfeature();
		

	}

}
