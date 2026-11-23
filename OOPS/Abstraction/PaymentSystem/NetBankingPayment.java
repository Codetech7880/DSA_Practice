package OOPS.Abstraction.PaymentSystem;

import java.util.Scanner;

public class NetBankingPayment implements Payment{
    
     @Override 
    public void processPayment(double amount){
        
        System.out.println("Total payable amount : " + amount);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payable amount : ");
        double payableAmount = sc.nextDouble();

        if(payableAmount == amount){
            System.out.println("Paymanet Sucessfull.");
        }else{
            if(payableAmount < amount){
                System.out.println("You entered less amount.");
            }else if(payableAmount > amount){
                System.out.println("You entered greater amount.");
            }else{
                System.out.println("Paymnet failed.");
            }
        }

    }

    @Override 
    public void refundPayment(double amount){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter refundable amount : ");
        double refundAmount = sc.nextDouble();

        if(refundAmount > 0){
            if(refundAmount <= amount){
                double leftAmount = amount - refundAmount;
                System.out.println("Refund sucessfully initiated.");
                System.out.println("Left amount will be : " + leftAmount);
            }else{
                System.out.println("Amount can't be greater than zero.");
            }
        }else{
            System.out.println("Refund amount cannot be smaller or equal to zero.");
        }
    }

}
