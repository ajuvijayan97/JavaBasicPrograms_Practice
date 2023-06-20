package oops;

interface BasicAnimal {
	public void eat();
	public void sleep();
}

class Monkey {
	public void jump() {
		System.out.println("Monkey Jump");
	}
	
	public void bite() {
		System.out.println("Monkey Bite");
	}
}

class Human extends Monkey implements BasicAnimal {
	public void speak() {
		System.out.println("Human Speak");
	}

	@Override
	public void eat() {
		System.out.println("Human Eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("Human Sleep");
		
	}
	
}


public class Interfacepgm3 {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.bite();
		obj.eat();
		obj.jump();
		obj.sleep();
		obj.speak();
		
	}

}
