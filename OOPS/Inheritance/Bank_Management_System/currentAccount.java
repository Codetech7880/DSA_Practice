package OOPS.Inheritance.Bank_Management_System;

public class currentAccount extends bankAccount {

    public currentAccount(String accountHolder, double accountNumber) {
        super(accountHolder, accountNumber);
    }

    public void overDraftLimit(double userWithdrawAmount){
        if(userWithdrawAmount > 100000){
            System.out.println("Amount out of limit.");
        }else{
           if(getBalance() > userWithdrawAmount){
                System.out.println("Withdraw sucessfully.");
            }else{
                System.out.println("Insufficient bank balance.");
            } 
        }
    }
    
}
