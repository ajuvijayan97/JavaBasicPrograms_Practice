package oops;

interface Bank {
    public void deposit();
    public void withdraw();
    public void balance();
}

class SBI implements Bank {
    
	@Override
    public void deposit() {
        System.out.println("SBI Deposit");
    }

    @Override
    public void withdraw() {
        System.out.println("SBI Withdraw");
    }

    @Override
    public void balance() {
        System.out.println("SBI Balance");
    }
}

class Federal implements Bank {

	@Override
	public void deposit() {
		System.out.println("Federal Deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Federal Withdraw");
		
	}

	@Override
	public void balance() {
		System.out.println("Federal Balance");
		
	}
	
}


public class Interfacepgm {

	public static void main(String[] args) {
		Bank obj = new SBI();
		obj.balance();
		obj.deposit();
		obj.withdraw();
		
		obj = new Federal();
		obj.balance();
		obj.deposit();
		obj.withdraw();

	}

}
