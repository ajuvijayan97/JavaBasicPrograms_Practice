package oops;

import java.util.Scanner;

interface Bank1 {
    public void showDetails();
    public void balance();
    public void deposit();
    public void withdraw();
}

class Canara implements Bank1 {
    String bankName = "CANARA";
    String accountHolderName = "Prajeesh";
    int balance = 50000;
    int accountNumber;
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void showDetails() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
    
    @Override
    public void balance() {
        System.out.println("Current Account Balance: " + balance);
    }
    
    @Override
    public void deposit() {
        System.out.print("Enter Amount to Deposit: ");
        int depositAmount = sc.nextInt();
        balance += depositAmount;
        System.out.println("Current Account Balance: " + balance);
    }

    @Override
    public void withdraw() {
        System.out.print("Enter Amount to Withdraw: ");
        int withdrawalAmount = sc.nextInt();
        	balance -= withdrawalAmount;
            System.out.println("Current Account Balance: " + balance);
    }
}

public class BankApplicationProgram {
    public static void main(String[] args) {
        Canara obj = new Canara();
        obj.showDetails();
        obj.balance();
        obj.deposit();
        obj.withdraw();
    }
}
