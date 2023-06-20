package oops;

class car {
	public void accelerator() {
		System.out.println("Accelerator");
	}
}

class bmw extends car {
	@Override
	public void accelerator() {
		System.out.println("BMW accelerator");
		super.accelerator();
	}
}

public class MethodOveriding {

	public static void main(String[] args) {
		bmw obj = new bmw();
		obj.accelerator();

	}

}
