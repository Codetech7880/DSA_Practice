// package OOPS.Polymorphism.onlineShoppingPaymentSystem;

import java.util.Scanner;

public class CardPayment extends Payment{
    
    @Override 
    public void processPayment(){

        // By card payment we give 10% discount.
        double discountAmount = (10 * getAmount()) / 100;
        double totalAmount = getAmount() - discountAmount;

        System.out.println("Product price is : " + getAmount());
        System.out.println("10% off by card payment : " + discountAmount);
        System.out.println("Total amount you have to pay : " + totalAmount);

        Scanner sc = new Scanner(System.in);

        System.out.print("User pay amount : ");
        double userUPIPayAmount = sc.nextDouble();
        
        if(userUPIPayAmount == totalAmount){
            System.out.println("Payment Sucessfully.");
        }else{
            System.out.println("Payment failed.");
        }

    }

}
