package OOPS.Abstraction.PaymentSystem;

public class MainMethod {
    public static void main(String[] args) {
        
        UPIPayment obj1 = new UPIPayment();
        CardPayment obj2 = new CardPayment();
        NetBankingPayment obj3 = new NetBankingPayment();

        obj1.processPayment(5000);
        obj1.refundPayment(5000);
       
        obj2.processPayment(5000);
        obj2.refundPayment(4000);
       
        obj3.processPayment(5000);
        obj3.refundPayment(7000);

    }
}
