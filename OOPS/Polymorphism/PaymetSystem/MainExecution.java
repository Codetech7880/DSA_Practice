package OOPS.Polymorphism.PaymetSystem;

public class MainExecution {
    public static void main(String[] args) {
        
        Cash obj1 = new Cash();
        UPI obj2 = new UPI();
        CreditCard obj3 = new CreditCard();

        obj1.makePayment();
        obj2.makePayment();
        obj3.makePayment();

    }
}
