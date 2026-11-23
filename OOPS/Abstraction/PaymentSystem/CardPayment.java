package OOPS.Abstraction.PaymentSystem;

import java.util.Scanner;

public class CardPayment implements Payment {
    
    @Override 
    public void processPayment(double amount){
        double discountAmount = (10 * amount) / 100;
        System.out.println("Discount shoud be initialeted by card : " + discountAmount);

        double totalAmount = amount - discountAmount;
        System.out.println("Total payable amount : " + totalAmount);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payable amount : ");
        double payableAmount = sc.nextDouble();

        if(payableAmount == totalAmount){
            System.out.println("Paymanet Sucessfull.");
        }else{
            if(payableAmount < totalAmount){
                System.out.println("You entered less amount.");
            }else if(payableAmount > totalAmount){
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
