package OOPS.Polymorphism.PaymetSystem;

public class Cash extends Payment{

    // Method override
    @Override 
    public void makePayment(){
        super.makePayment();

        System.out.println("Make payment by using Cash");

    }
}
