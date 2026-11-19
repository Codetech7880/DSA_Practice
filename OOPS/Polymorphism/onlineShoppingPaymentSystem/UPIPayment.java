// package OOPS.Polymorphism.onlineShoppingPaymentSystem;

import java.util.Scanner;

public class UPIPayment extends Payment{
    
    @Override 
    public void processPayment(){

        double plateformFee = 200;
        double totalAmount = getAmount() + plateformFee;

        System.out.println("By UPI");
        System.out.println("Plateform fee : " + plateformFee);
        System.out.println("Price of the product : " + getAmount());
        System.out.println("You have to pay by UPI : " + totalAmount);

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
