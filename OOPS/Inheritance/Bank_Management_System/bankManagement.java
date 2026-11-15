package OOPS.Inheritance.Bank_Management_System;

public class bankManagement {
    public static void main(String[] args) {

        savingAccount obj1 = new savingAccount("Sachin Sharma", 23456789);
        currentAccount obj2 = new currentAccount("Sachin Sharma", 23456789);

        System.out.println("Saving Account");
        obj1.setBalance(200000);
        
        obj1.intrestRate();
        obj1.deposit();
        obj1.withdraw();
        obj1.displayBalance();
        
        System.out.println("Current Account");
        obj2.setBalance(4000000);
        obj2.overDraftLimit(40000);
        obj1.deposit();
        obj1.withdraw();
        obj1.displayBalance();

    }

    
}
