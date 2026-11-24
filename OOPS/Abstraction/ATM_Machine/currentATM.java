// package OOPS.Abstraction.ATM_Machine;

import java.util.Scanner;

public class currentATM extends ATM {
    
    currentATM(double pin, double balance){
        super(pin, balance);
    }

    @Override 
    public void withdraw(double amount){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter overdraft limit : ");
        double overdraftLimit = sc.nextDouble();

        if(amount > overdraftLimit){
            System.out.println("You have entered over the limit.");
        }else if(amount <= 0){
            System.out.println("You can't entered less than 1 value.");
        }else{
            double leftBalance = overdraftLimit - amount;
            System.out.println("Withdraw sucessfully.");
            System.out.println("Left overdraft balance is : " + leftBalance);
        }

        sc.close();
    }

}
