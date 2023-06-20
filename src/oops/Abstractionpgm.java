package oops;

abstract class Car{
	abstract public void speedlimit();
	public void carengine() {
		System.out.println("Car Engine");
	}
}

class Maruti extends Car{

	@Override
	public void speedlimit() {
		System.out.println("Maruti SpeedLimit");
		
	}
	
}

public class Abstractionpgm {

	public static void main(String[] args) {
		
		Maruti maruti = new Maruti();
		maruti.speedlimit();
		maruti.carengine();

	}

}
