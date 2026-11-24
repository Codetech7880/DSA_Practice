// package OOPS.Abstraction.ATM_Machine;

public class SavingATM extends ATM {
    
    SavingATM(double pin, double balance){
        super(pin, balance);
    }

    @Override 
    public void withdraw(double amount){
       double addIntrest = (4 * getBalance()) / 100;
       System.out.println("Intrest credited at amount " + getBalance() + " : " + addIntrest);

       double totalAmount = getBalance() + addIntrest;
       System.out.println("Total balance : " + totalAmount);

       if(amount <= 0){
        System.out.println("Withdraw amount can't be zero or negative");
       }else if(amount > totalAmount){
        System.out.println("Amount can't be greater than initial balance.");
       }else if(amount <= totalAmount){
        double leftBalance = totalAmount - amount;
        System.out.println("Withdraw sucessfully.");
        System.out.println("Balance left in your account : " + leftBalance);
       }else{
        System.out.println("Some error occured.");
       }
    }

}
