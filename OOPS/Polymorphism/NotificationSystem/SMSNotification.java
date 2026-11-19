package OOPS.Polymorphism.NotificationSystem;

// This is a child class that extends parent class.
public class SMSNotification extends Notification {
    
    // This is method overriding.
    @Override 
    public void sendMessage(){
        // Printing the output.
        System.out.println("SMS Notification");

    }

}
