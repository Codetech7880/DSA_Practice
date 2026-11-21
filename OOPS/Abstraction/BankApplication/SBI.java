package OOPS.Abstraction.BankApplication;

public class SBI extends Bank{

    @Override 
    public void deposit(double amount){

        double totalAmount = getBalance() + amount;
        System.out.println("Deposited sucessfully.");
        System.out.println("Total balance is : " + totalAmount);

    }

    @Override 
    public void withdraw(double amount){

        double totalAmount = getBalance() - amount;
        System.out.println("Withdraw sucessfully.");
        System.out.println("Total amount is : " + totalAmount);

    }

    @Override 
    public void checkBalance(){
        System.out.println("Your balance is : " + getBalance());
    }

}
