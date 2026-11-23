package OOPS.Abstraction.PaymentSystem;

public interface Payment {

    void processPayment(double amount);

    void refundPayment(double amount);

}
