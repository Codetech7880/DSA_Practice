package OOPS.Abstraction.BankApplication;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        
        SBI obj = new SBI();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter initial balance :");
        int initialBalance = sc.nextInt();

        obj.setBalance(initialBalance);

        System.out.print("Enter the amount : ");
        int amount = sc.nextInt();


        obj.deposit(amount);
        obj.withdraw(amount);
        obj.checkBalance();

    }
}
