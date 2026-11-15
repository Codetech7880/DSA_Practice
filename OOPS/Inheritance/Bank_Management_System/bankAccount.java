package OOPS.Inheritance.Bank_Management_System;

import java.util.Scanner;

public class bankAccount {
    public String accountHolder;
    public double accountNumber;
    private double balance;

    public bankAccount(String accountHolder, double accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount that you want to deposit ");
        double userDepositAmount = sc.nextDouble();

        if(userDepositAmount > 0){
            balance += userDepositAmount;
            System.out.println("Amount sucessfully deposited.");
        }else{
            System.out.println("Invalid Cridentials.");
        }
    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount that you want to withdraw ");
        double userWithdrawAmount = sc.nextDouble();

        if(userWithdrawAmount < balance){
            balance -= userWithdrawAmount;
            System.out.println("Amount withdraw sucessfully.");
        }else{
            System.out.println("Insufficient bank balance.");
        }
    }
    public void displayBalance(){
        System.out.println("Your balance is : " + balance);
    }
}
