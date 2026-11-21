package OOPS.Abstraction.BankApplication;

abstract class Bank {

    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    abstract void checkBalance();

}
