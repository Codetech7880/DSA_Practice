package OOPS.Abstraction.PaymentSystem;

import java.util.Scanner;

public class UPIPayment implements Payment {
    
    @Override 
    public void processPayment(double amount){
        double plateformFee = (10 * amount) / 100;
        System.out.println("Plateform fee : " + plateformFee);
        double totalAmount = amount + plateformFee;
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
        System.out.print("Enter refund amount : ");
        double refundAmount = sc.nextDouble();

        if(refundAmount <= 0){
            System.out.println("Refund amount must be greater than 0.");
        }else if(refundAmount > amount){
            System.out.println("Refund amount must be smaller than originaal amount.");
        }else if(refundAmount == amount){
            System.out.println("Refund sucessfully.");
        }else{
            System.out.println("Some error occured.");
        }

    }

}
