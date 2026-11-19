// package OOPS.Polymorphism.onlineShoppingPaymentSystem;

import java.util.Scanner;

public class NetBankingPayment extends Payment{
    
    @Override 
    public void processPayment(){

        double totalAmount = getAmount();

        System.out.println("By net banking there is no plateform fee.");
        System.out.println("By net banking you have to pay : " + totalAmount);

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
