package OOPS.Encapsulation;

import java.util.Scanner;

class BankAccount{
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount < 0){
            System.out.println("Negative deposite not allowed!");
        }else{
            balance += depositAmount;
            System.out.println("Your total balance is : " + balance);
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount < 0){
            System.out.println("Negative withdraw not allowed!");
        }else{
            if(balance < withdrawAmount){
                System.out.println("Insufficient balance");
            }else{
                balance -= withdrawAmount;
                System.out.println("Withdraw sucessfully");
                System.out.println("Your balance is : "+ balance);
            }
        }
    }
}

public class bankInformation {
    public static void main(String[] args) {
        
        BankAccount obj = new BankAccount("Sachin", 23456789);
        obj.setBalance(5000);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deposit amount : ");
        double depositAmount = sc.nextDouble();

        obj.deposit(depositAmount);

        System.out.print("Enter withdraw amount : ");
        double withdrawAmount = sc.nextDouble();

        obj.withdraw(withdrawAmount);

    }
}
