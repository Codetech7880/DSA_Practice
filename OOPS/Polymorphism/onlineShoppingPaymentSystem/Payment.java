// package OOPS.Polymorphism.onlineShoppingPaymentSystem;

public class Payment {
    private double amount;

    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }

    public void processPayment(){
        System.out.println("Choose payment mode");
    }
    
}
