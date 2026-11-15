package OOPS.Inheritance.Bank_Management_System;

public class savingAccount extends bankAccount {

   public savingAccount(String accountHolder, double accountNumber){
    super(accountHolder, accountNumber);
   }

   public void intrestRate(){
    double intrest = (getBalance() * 2.50f) / 100;
    System.out.println("Intrest per month : " + intrest);
   }
    
}
