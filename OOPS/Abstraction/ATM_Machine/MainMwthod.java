// package OOPS.Abstraction.ATM_Machine;

import java.util.Scanner;

public class MainMwthod {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Set pin : ");
        double userPin = sc.nextDouble();

        System.out.print("Set your balance : ");
        double userBalance = sc.nextDouble();
        
        SavingATM obj1 = new SavingATM(userPin, userBalance);
        currentATM obj2 = new currentATM(userPin, userBalance);

        System.out.print("Enter deposited amount : ");
        double depositAmountForSavingATM = sc.nextDouble();
        obj1.deposit(depositAmountForSavingATM);

        System.out.print("Enter pin : ");
        int savingATMPin = sc.nextInt();
        obj1.authenticate(savingATMPin);

        System.out.print("Enter withdraw amount : ");
        double savingATMWithdrawAmount = sc.nextDouble();
        obj1.withdraw(savingATMWithdrawAmount);
    
        System.out.print("Enter deposited amount : ");
        double depositAmountForCurrentATM = sc.nextDouble();
        obj2.deposit(depositAmountForCurrentATM);

        System.out.print("Enter pin : ");
        int currentATMPin = sc.nextInt();
        obj2.authenticate(currentATMPin);

        System.out.print("Enter withdraw amount : ");
        double currentATMWithdrawAmount = sc.nextDouble();
        obj2.withdraw(currentATMWithdrawAmount);

        sc.close();

    }
}
