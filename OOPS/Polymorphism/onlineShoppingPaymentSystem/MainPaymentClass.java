// package OOPS.Polymorphism.onlineShoppingPaymentSystem;

import java.util.Scanner;

public class MainPaymentClass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Payment[] obj1 = new Payment[3];
        
        obj1[0] = new UPIPayment();
        obj1[1] = new CardPayment();
        obj1[2] = new NetBankingPayment();
        
        for(int i = 0; i < obj1.length; i++){

            System.out.print("Set product amount : ");
            double amount = sc.nextDouble();
            obj1[i].setAmount(amount);

            obj1[i].processPayment();

        }
        sc.close();

    }
}