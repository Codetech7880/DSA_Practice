// package OOPS.Abstraction.ATM_Machine;

abstract class ATM {
    private double pin;
    private double balance;

    ATM(double pin, double balance){
        this.pin = pin;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    abstract void withdraw(double amount);

    public void deposit(double amount){
        double totalBalance = amount + balance;
        System.out.println("Deposited Sucessfully.");
        System.out.println("Your total amount is : " + totalBalance);
    } 

    public void authenticate(int enteredPin){
        if(enteredPin == pin){
            System.out.println("Access graunted.");
        }else{
            System.out.println("Access Denied.");
            System.out.println("Please enter correct pin.");
        }
    }
}